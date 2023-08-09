# Programação Orientada a Objetos com JAVA
Curso de Java do Alura

## Conceitos 

### Classe

Uma classe é um conceito que representa na linguagem de programação um objeto na vida real, quando criamos uma classe é como se estivéssemos criando um tipo primitivo como inteiro (int) ou double. A partir das características de um objeto na vida real são criados os atributos de uma classe e a partir de suas ações são modelados os métodos de uma classe.

Características do Objeto = Atributos

Ações do Objeto = Métodos

Também podemos fazer uma analogia de uma classe como um molde ou fábrica que produz/fabrica itens(Objetos) com características(Atributos) e realizam ações(Métodos) pré-definidos. 


### Objeto

Um objeto é uma instância de uma classe, um objeto é instanciado a partir da palavra reservada new(). 

### Visibilidade dos Atributos e Métodos

Public (Público) -> Atributos e métodos públicos podem ser acessados por qualquer outra classe.

Protected (Protegido) -> Atributos e métodos protegidos podem ser acessados pelas classes que estão contidas em um mesmo pacote ou por suas classes filhas/subclasses.

Private (Privado) -> Atributos e métodos só podem ser acessados pela própria classe ou por meio de métodos assessores quando nos referimos aos atributos.

### Encapsulamento

Se refere ao ato de restringir o acesso aos atributos e métodos de uma determinada classe, o acesso deverá ser realizado a partir de métodos assessores get() e set(). O encapsulamento permite a criação de regras para modificação e acesso aos atributos de uma determinada classe.

### Herança

Permite o reaproveitamento de código entre classes com características comuns, a partir da herança é possível criar uma superclasse/ classe pai e uma ou mais subclasses/classes filhas. As subclasses herdam todas as características de sua superclasse, além de poder implementar suas próprias características ou sobrescrever as características de sua classe pai.


### Polimorfismo

Polimorfismo é a capacidade de um objeto ser referenciado de diversas formas diferentes e com isso realizar as mesmas tarefas (ou chamadas de métodos) de diferentes formas.

### Interface

Em Java, interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.
