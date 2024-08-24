# Sistema de Passagens Aéreas

Este é um projeto Java que simula um sistema de passagens aéreas. Ele realiza operações de login para gerenciar e consultar as informações de passageiros armazenadas em um banco de dados MySQL, com interações feitas via console.

## Descrição

O Sistema de Passagens Aéreas permite que usuários façam login e gerenciem informações relacionadas aos passageiros, como dados pessoais, documentos e destinos de viagem. O sistema consulta e manipula essas informações diretamente de um banco de dados MySQL.

## Estrutura do Projeto

- **Classe `Usuario`**: Gerencia as informações de login dos usuários.
- **Classe `Passageiro`**: Armazena e manipula os dados do passageiro, como nome, documentos e contato.
- **Classe `BancoDeDados`**: Realiza a conexão com o banco de dados MySQL e executa as operações de CRUD.
- **Classe `SistemaDePassagens`**: Contém o método `main` que gerencia a lógica da aplicação via console.

## Funcionalidades

- **Login de Usuário**: Autentica o usuário antes de acessar as informações dos passageiros.
- **Consulta de Passageiros**: Permite buscar e exibir informações de passageiros a partir do banco de dados.
- **Cadastro e Atualização de Passageiros**: Adiciona e edita dados dos passageiros.
- **Remoção de Passageiros**: Remove registros de passageiros do banco de dados.




