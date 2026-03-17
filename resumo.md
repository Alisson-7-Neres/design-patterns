# Design Patterns

| Tecnologias  |
 | :-----------  |
 |Java  |
 |Spring boot |
 |Rest Api |
 |Database h2 |
 |Swagger  |


## Singleton:

O Singleton é um padrão de projeto **criacional** que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.
<br>

**Todas as implementações do Singleton tem esses dois passos em comum**:<br>
* Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.<br>
* Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo estático. <br>
* Todas as chamadas seguintes para esse método retornam o objeto em cache.<br>
**Estrutura**

<img src="img/01-singleton.png"/>

Existem três maneiras comuns de implementar o padrão Singleton em Java: **Lazy Initialization**, **Eager Singleton** e **Lazy Holder Singleton**. Cada abordagem tem seus próprios benefícios e desvantagens, e a escolha da abordagem correta dependerá dos requisitos específicos da sua aplicação.<br>

**Lazy**<br>
A instância é criada apenas quando necessário. Isso pode ajudar a economizar recursos de memória, mas pode resultar em um pequeno atraso no tempo de inicialização da instância.
<br>
**Eager**<br>
A instância é criada logo na declaração da variável, tornando a criação da instância mais rápida. Essa abordagem é ideal quando você precisa que a instância esteja disponível imediatamente.
<br>
**Lazy Holder Singleton**<br>
A abordagem Lazy Holder Singleton é uma variação da abordagem Lazy Initialization, onde a instância é encapsulada em uma classe privada que é carregada somente quando a instância é chamada pela primeira vez. Isso combina os benefícios das abordagens Lazy Initialization e Eager Singleton e é geralmente considerada a melhor abordagem para implementar o padrão Singleton em Java.
