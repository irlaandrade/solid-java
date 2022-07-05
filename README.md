# SOLID com Java: princípios da programação orientada a objetos
Este curso faz parte da formação **Arquitetura e Design de Projetos Java** da Alura Cursos, e este repositório tem como finalidade registrar o aprendizado obtido durante as aulas.

## Princípios SOLID
- **S**ingle Responsability Principle
- **O**pen Closed Principle
- **L**iskov Substitution Principle
- **I**nterface Segregation Principle
- **D**ependency Inversion Principle

Esses 5 princípios são uma ferramenta poderosa para mantermos um código de fácil entendimento, fácil refatoração e com o menor número possíveis de bugs.
Antes de falarmos sobre eles, acho importante destacarmos os 3 pilares do Paradigma da Programação Orienta a Objetos: Coesão, Encapsulamento e Acoplamento.

### Coesão
Se consultarmos o dicionário, encontraremos que coesão nada mais é que a união harmônica entre uma coisa e outra. Levando para o mundo do desenvolvimento de software, a união harmônica seria as coisas que tem dentro de uma classe. Os atributos e métodos devem estar em harmonia, devem estar unidos e devem representar coisas em comum.
Será que é a responsabilidade da classe Funcionário de fazer uma consulta, um serviço externo, buscar, fazer essa chamada a uma API externa, fazer um tratamento ou coisas do gênero? Então talvez aí já estava fungindo aquela harmonia citada anteriormente.
A classe está fazendo coisas demais, então ela deveria ter uma responsabilidade única. Coesão é isso, ter classes que fazem apenas uma única coisa.
Classes não coesas tendem a crescer indefinidamente, o que as tornam difíceis de manter.

### Encapsulamento
Proteger, blindar uma classe contra influências externas, contra manipulações externas que podem prejudicar a consistência das informações. Quando temos classes não encapsuladas, isso faz com que tenhamos violações da regra de negócio do projeto, além de aumentar o acoplamento. Importante frisar que encapsulamento não é apenas colocar os atributos como private e adicionar getters e setters.

### Acoplamento
A ideia de você acoplar é quando você tem dois componentes que estão interligados entre si causando uma dependência entre eles. Uma classe A chama uma classe B. Acoplamento forte: quando a alteração em uma classe impacta em diversas outras.

---

Vamos aos princípios do SOLID

## 1. Single Responsability Principle
Foco em coesão.
"Uma classe deveria ter apenas um único motivo para mudar" (Robert (Uncle Bob) Martin)

Uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software, ou seja, a classe deve ter uma única tarefa ou ação para executar.
## 2. Open Closed Principle
Princípio do aberto fechado.
Entidades de software, entidades entendam como, classes, módulos, funções ou coisas do gênero, elas deveriam estar sempre abertas para extensão para você adicionar coisas novas, novos comportamentos, porém fechadas para modificação.
Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes.

## 3. Liskov Substitution Principle
Uma classe derivada deve ser substituível por sua classe base.
Objetos podem ser substituídos por seus subtipos sem que isso afete a execução correta do programa.

## 4. Interface Segregation Principle
"Uma classe não deveria ser forçada a depender de métodos que não utilizará" (Robert (Uncle Bob) Martin)

## 5. Dependency Inversion Principle
A ideia é que abstrações não devem depender de implementações. A abstração deve ser totalmente abstrata. Ela não depende de nenhuma implementação específica. A implementação sim é que deveria depender de uma abstração.

---
## Links de apoio:
- [O que é SOLID: O guia completo para você entender os 5 princípios da POO](https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530)
- [Coesão, encapsulamento e acoplamento os pilares da orientação a objetos.](https://medium.com/@functionoliveira/coes%C3%A3o-encapsulamento-e-acoplamento-os-pilares-da-orienta%C3%A7%C3%A3o-a-objetos-514f2014426)
- [POO: tudo sobre Programação Orientada a Objetos!](https://blog.betrybe.com/tecnologia/poo-programacao-orientada-a-objetos/)
- [SOLID: guia completo sobre os 5 princípios da POO!](https://blog.betrybe.com/linguagem-de-programacao/solid-cinco-principios-poo/)
- [Guia Básico sobre Princípios de Programação e SOLID](https://dev.to/guilhermemanzano/guia-basico-sobre-principios-de-projetos-e-solid-4m59)

---

Este projeto encontra-se em desenvolvimento e está aberto para pull request.

Feito com ❤ por Irla Andrade 👋🏽 Entre em contato:

[![Linkedin Badge](https://img.shields.io/badge/-irlaandrade-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/irlaandrade/)](https://www.linkedin.com/in/irlaandrade/)

[![Gmail Badge](https://img.shields.io/badge/gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:paula.irla@gmail.com)](mailto:paula.irla@gmail.com)
