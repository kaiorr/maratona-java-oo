
### Coesão

 - [x] Uma class serve a um único propósito que é abstrair o mundo real para o código.

### Método

- [x] Método sem retorno ``void``, comparando com o JS é uma função que não retorna nada.
- [x] Passando parâmetros para métodos. Tipos ``Primitivos`` e tipo ``Reference``, dentro da classe quando é passado
uam variável do tipo ``primitivo`` a variável original nunca será alterada, não importa o que aconteça dentro do método.
  Porquê repassando uma cópia do valor e passa para variável de referência que foi criada.
  
- [x] Criado um método de referência para objetos distintos no ``ImpressoraEstudante``. Podem existir várias referêcias 
para o mesmo objeto.

- [x] Criando referência dentro do objeto, utilizando a variável de referência ``this``, é feito dentro do mesmo obbjeto
a referência.
  
- [x] Utilizando método de Array com ``varArgs`` onde a diferença está somente na forma como é feito a chamada, e ao 
para o array como parâmetro no método.
  
### Acoplamento

- [x] Resumidamente, acoplamento é quando uma classe conhece da outra, quando uma ou mais classes estão conectadas.
Uma das formas de garantir um baixo acoplamento utilizando modificadores de acesso. Exemplo atributos ``private`` onde
  os atributos de determinado objeto pode ser acessado dentro mesmo.
  Como introdução do baixo acoplamento será utilizado e modificador de acesso private, então será utilizado ``get`` e ``set``
  para atribuição de valor.
  
### Sobrecarga de Método

- [x] É quando possuir o mesmo método com mesmo nome, porém o tipo ou quantidade de parâmetros é diferente do método original.

### Construtor

- [x] Não pode haver retorno e sempre terá o mesmo nome da Classe. Quando houver necessidade de realizar a sobrecarga de 
construtor o ``this()`` é obrigatório que seja a primeira linha, dentro os tipos obrigatórios do construtor herdado.
  
### Bloco de Inicialização

- [x] Utilizado para alocar espaço em memória para o objeto. Cada atributo de classe é criado e inicializado com valores
default ou que for passado. Bloco de inicialização é executado. Construtor é executado.
  
### Modificador de Acesso Static

- [x] Faz com que algum atributo pertença direto a classe, todos os objetos vão compartilhar do mesmo valor, caso for alterado
o valor do atributo, será alterado para todos os objetos da classe.
  
### Método Static

- [x] Método estático não pode acessar atributos de instância, porquê somente pode acessar variáveis estáticas são carregadas
pela JVM antes mesmo de algum objeto ser carregado em memória.
  
### Bloco Inicialização Estático

- [x] O bloco de inicialização static é executado pela JVM quando carregar a classe. Independente da quantidade de blocos inicialização
estáticos os mesmos serão executados apenas uma vez.
  
### Associação Unidimensional

- [x] Utilizado de um para muitos, no exemplo JogadorTest1 e JogadorTest2 é utilizado exemplo de 1 jogador pode pertencer somente a 1 time, 
porém 1 Time pode ter vários jogadores, conforme descrito no exemplo foi realizado tratamento da classe Jogador e Time.
  
- [x] Muitos para Um, exemplificado pelas classes Escola, Professor.

### Herança

- [x] Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". 
  Ela é usada na intenção de reaproveitar código, comportamento generalizado ou especializar operações ou atributos
  
- [x] Sobrescrita com ``super`` exemplo: A super Classe ``Pessoa`` realiza impressão de todos os seus atributos enquanto a classe ``Funcionario``
extende os atributos de pessoa, porém também precisa realizar a impressão de seu atributo que é ``salario``. 
  
- [x] Contructor: Toda vez que for adicionado um construtor a classe mãe, obrigatoriamente será necessário alterar em todas as classes filhas.

- [x] Sequência de Inicialização: 
  - [0] Bloco de estático da super classe é executada quando a JVM carregar a classe pai.
  - [1] Bloco inicialização estático da subclasse é executada quando a JVM carregar a classe filha.
  - [2] Alocado espaço em memória pro objeto da superclasse.
  - [3] Cada atributo da superclasse é executado na ordem em que aparece.
  - [4] Bloco de inicialização da superclase é executado na ordem em que aparece
  - [5] Construtor é executado da superclasse.
  - [6] Alocado espaço em memória pro objeto da subclasse.
  - [7] Cada atributo da subclasse é cirado e inicializado em valores default.
  - [8] Bloco de inicialização da subclasse é executado na ordem em que aparece.
  - [9] Construtor é executado da subclasse.
  
### Sobrescrita método toString()

- [x] método nativo para sobrescita de atributos, onde é necessário a utilização do ``Override`` para informar caso seja importado
o método com nome diferente do nativo.
  
### Modificador Final

- [x] Para definir como constante. Ex: Objeto Carro, atributo ``VELOCIDADE_LIMITE = 250``. 
- [x] Geralmente utilizado para implementar padrão de projeto ``Singleton``.
- [x] Caso alguma classe estiver com modificador ``final`` não pode ser extendida.
- [x] Caso for utilizado em algum método, não será possível realizar a sobrescrita do método.

### ENUM

- [x] São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. 
  Na linguagem de programação Java, pode ser definido um tipo de enumeração usando a palavra chave ``enum``. Todos os tipos enums implicitamente 
  estendem a classe ``java.lang.Enum``, sendo que o Java não suporta herança múltipla, não podendo estender nenhuma outra classe.
  
- [x] Enumeração part.2, foi utilizados atributos de identificação ``valor`` e ``nomeRelatorio`` primeiro para identificação do mesmo ao
ser inserido na base de dados e outro para formatação do nome em relatórios. No construtor da Enum Class ``TipoCliente`` foram inseridos
  esses atributos e para impressão no console os mesmos foram adicionados no ``toString`` con ``tipoCliente.getValor()`` e
  ``tipoCliente.getNomeRelatorio()``.
  
- [x] Enumeração part.3, foi apresentado mais um caso de uso com cálculo de desconto em tipo de pagamento com ``abstract``.

- [x] Enumeração part4, apresenta uma forma de utilizar a busca por atributos.

### Classes Abstratas

- [x] Pode-se dizer que as classes abstratas servem como “modelo” para outras classes que dela herdem, não podendo ser instanciada por si só. 
  Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe.
  
### Interface

- [x] A ``interface`` é um recurso muito utilizado para obrigar a um determinado grupo de classe a ter métodos ou propriedades em comum
para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente.
  
- [x] Sempre vai prover uma implementação onde as classes que vão utilizar esse contrato precisam utilizar o ``implements``.

- [x] Implementado a partir da versão 8, o ``default`` permite colocar métodos concretos com funcionalidade.