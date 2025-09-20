# Clean House

## Sobre o Projeto

O Clean House é uma plataforma digital exclusiva para a contratação de serviços de limpeza. O sistema foi desenvolvido como parte do projeto de Arquitetura de Software no Centro Universitário de Ourinhos (UNIFIO).

## Funcionalidades

O sistema Clean House oferece as seguintes funcionalidades:

* **Pesquisa de Serviços:** Permite que qualquer usuário, logado ou não, pesquise por serviços de limpeza utilizando filtros como localização, faixa de preço, tipo de serviço, disponibilidade e avaliação das profissionais.
* **Seleção de Serviços:** O usuário pode selecionar uma profissional para visualizar mais detalhes sobre os serviços oferecidos.
* **Detalhes do Serviço:** Exibe o perfil completo da profissional, com informações como serviços prestados, descrição pessoal, agenda, localização e avaliações de outros clientes.
* **Cadastro e Login:** Novos usuários (clientes ou prestadoras) podem criar uma conta, e usuários cadastrados podem acessar suas contas.
* **Solicitação de Serviço:** Clientes autenticados podem solicitar serviços, especificando data, horário, tipo de serviço e outras informações.
* **Comunicação via Chat:** Após a aceitação de um serviço, clientes e profissionais podem se comunicar por meio de um chat interno.
* **Login com Redes Sociais:** Permite que os usuários façam login utilizando contas de outras redes, como Google e Facebook.
* **Responsividade:** O sistema é projetado para ser acessível em qualquer dispositivo.
* **Histórico e Transações:** Clientes podem visualizar o histórico de serviços contratados e as transações financeiras realizadas na plataforma.
* **Diversos Tipos de Pagamento:** A plataforma oferece diferentes formas de pagamento.
* **Recomendações e Avaliações:** A página inicial exibe profissionais recomendadas e permite que os clientes visualizem o feedback de outros usuários.

## Tecnologias Utilizadas

* **Java:** Linguagem de programação principal.
* **Quarkus:** Framework Java para desenvolvimento de aplicações nativas em nuvem.
* **Maven:** Ferramenta de automação de compilação e gerenciamento de dependências.
* **SQL:** Linguagem para gerenciamento de banco de dados.
* Em breve integração com **Angular**.

## Começando

Para executar o projeto localmente, siga estas etapas:

1.  **Pré-requisitos:**
    * JDK 11+
    * Maven 3.6.2+
    * Um sistema de gerenciamento de banco de dados SQL (por exemplo, PostgreSQL, MySQL).

2.  **Clonando o Repositório:**
    ```sh
    git clone [https://github.com/brunaandradea/pi-clean-house](https://github.com/brunaandradea/pi-clean-house)
    cd pi-clean-house
    ```

3.  **Configurando o Banco de Dados:**
    * Crie um banco de dados para o projeto.
    * Configure as credenciais do banco de dados no arquivo `src/main/resources/application.properties`.

4.  **Executando a Aplicação:**
    ```sh
    mvn compile quarkus:dev
    ```

## Utilização

Após iniciar a aplicação, você pode acessar a API em `http://localhost:8080`.

## Banco de Dados

O sistema utiliza um banco de dados relacional para armazenar informações sobre usuários, serviços, solicitações e outras entidades relevantes.

## Equipe

* Bruna Andrade Alves
* Giovana Beatriz Ferreira
* Gustavo Kazuyuki Matsunaka
* Kayque Dias Moreno
* Lívia Prado
* Nelson Gilberto
* Pedro José Sieiro Marques

## Agradecimentos

* Agradecemos ao Centro Universitário de Ourinhos (UNIFIO) por fornecer a oportunidade de desenvolver este projeto.
