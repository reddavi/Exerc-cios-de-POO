# Sistema de Contatos

Este é um sistema simples de gerenciamento de contatos, onde você pode adicionar, pesquisar, exibir e remover contatos.

## Funcionalidades

- **Adicionar Contato:** Permite adicionar um novo contato fornecendo o nome e o número.
- **Pesquisar Contato:** Permite pesquisar um contato pelo nome e exibir suas informações.
- **Exibir Todos os Contatos:** Exibe uma lista de todos os contatos cadastrados.
- **Remover Contato:** Remove um contato existente pelo nome.

## Funcionalidades Adicionais Propostas

- **Edição de Contatos:** Permitir que os usuários editem as informações de um contato existente, como nome e número.
- **Exportar Contatos:** Adicionar a capacidade de exportar contatos para um formato padrão, como CSV ou vCard.
- **Notificação de Aniversário:** Implementar um sistema de notificação para lembrar os usuários dos aniversários de seus contatos.

## Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- `Contato`: Representa um contato com um nome e um número.
- `GravadorDeDados`: Classe responsável por lidar com a gravação e recuperação dos contatos em um arquivo.
- `interfaceContatos`: Define uma interface para as operações de gerenciamento de contatos.
- `MenuContatosGUI`: Interface gráfica de usuário (GUI) para interagir com o sistema de contatos.
- `SistemaContatos`: Implementação das operações de gerenciamento de contatos.

## Como Executar

Para executar o projeto, compile e execute a classe `MenuContatosGUI`. Certifique-se de ter todas as classes no mesmo pacote ou ajuste os imports conforme necessário.

## Notas

- Os contatos são armazenados em um arquivo `contatos.txt` no formato de objetos serializados.
- Em caso de falha ao recuperar ou salvar os contatos, mensagens de erro serão exibidas no console.
