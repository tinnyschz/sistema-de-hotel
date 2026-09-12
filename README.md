🏨Sistema de Hotel
Aplicação de console em Java para gerenciamento simples de quartos de hotel, desenvolvida como projeto de estudo dos fundamentos de Programação Orientada a Objetos.

🎯Objetivo
Praticar conceitos iniciais em Java como: coleções (ArrayList) e estruturas de controle (switch, while, for), simulando cadastro e reserva de quartos de um hotel via terminal.

Funcionalidades:
- cadastrar quarto (número e tipo: simples, duplo ou luxo)
- listar quartos cadastrados e sua disponibilidade
- reservar quarto
- cancelar reserva
- sair do sistema

Tecnologias: Java, interface via console (Scanner), sem persistência de dados.

Conceitos Praticados:
- orientação a oobjetos: separação em classes (Main, Hotel e Quarto)
- Encapsulamento com atributos privados e getters/setters
- composição: Hotel mantém uma ArrayList<Quarto>
- estruturas de controle: switch/case, while, for
- leitura de entrada do usuário com Scanner

Estrutura do projeto:
sistema-de-hotel/
├── Main.java     # Menu principal e interação com o usuário
├── Hotel.java    # Regras de negócio: cadastrar, listar, reservar, cancelar
└── Quarto.java   # Modelo do quarto (número, tipo, disponibilidade)
