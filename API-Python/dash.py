import time
from dashing import *
from psutil import *
import os
from functions import codeCleaner, sistema


def dashboard():

    ui = HSplit(
        VSplit(
            HSplit(
                VGauge(title='RAM'),
                title='Memória',
                border_color=3
            ),
            HSplit(
                Text(
                    '',
                    title='Disco',
                    border_color=6
                ),
                Text(
                    'Teste',
                    title='Processos',
                    border_color=1,
                ),
            )

        ),
        VSplit(
            HGauge(title='CPU %'),
            HGauge(title='cpu_1 %'),
            HGauge(title='cpu_2 %'),
            HGauge(title='cpu_3 %'),
            HGauge(title='cpu_4 %'),
            HGauge(title='cpu_5 %'),
            HGauge(title='cpu_6 %'),
            HGauge(title='cpu_7 %'),
            HGauge(title='cpu_8 %'),
            title="CPU",
            border_color=5,
        )
    )

    while True:

        # Memoria
        usoMemoria = memoriaDisponivel = ui.items[0]
        ram = ui.items[0].items[0].items[0]

        memoriaDisponivel.value = virtual_memory().total
        ram.value = virtual_memory().percent
        usoMemoria.value = virtual_memory().percent

        ram.title = f"RAM: {usoMemoria.value}% "

        # CPU
        cpu = ui.items[1]
        cpuPercentGraph = cpu.items[0]
        cpuPercent = cpu_percent()
        cpuPercentGraph.value = cpuPercent
        cpuPercentGraph.title = f"CPU {cpuPercent}%"

        usoPorCore = cpu_percent(percpu=True)

        cpuPercentCoreGraph = cpu.items[1:9]

        for i, (core, value) in enumerate(zip(cpuPercentCoreGraph, usoPorCore)):
            core.value = value
            core.title = f"cpu_{i} {value}%"

        # DISCO
        disco = ui.items[0].items[1].items[0]

        disco.text = f"{'Partição':<15}{'Uso':<10}"

        particoes = []
        if sistema == "Windows":
            for part in disk_partitions(all=False): # identificando partições
                if part[0] == "F:\\":
                    break
                elif part[0] == "E:\\":
                    break
                else:
                    particoes.append(part[0])
        elif sistema == "Linux":
            particoes.append("/")


        porcentagemOcupados = []
        for j in enumerate(particoes[0:8]):
            porcentagemOcupados.append(disk_usage(j[1]).percent)

            disco.text += '\n{:<15}{:<10}'.format(
                particoes[j[0]],
                porcentagemOcupados[j[0]]
            )

        time.sleep(5)

        os.system(codeCleaner)

        try:
            ui.display()
            time.sleep(1)
        except KeyboardInterrupt:
            return "0"