
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
  os atributos de determinado objeto pode ser acessado dentro do mesmo.
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