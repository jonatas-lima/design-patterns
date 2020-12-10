# Introdução
O padrão de projeto Strategy é um padrão comportamental, o qual permite que sejam implementadas **estratégias/comportamentos** diferentes em um objeto.
Geralmente, essas estratégias implementam uma interface e possuem uma relação de composição com o objeto concreto.

# Problema proposto
Suponha que você é o desenvolvedor de um sistema que administra patos, que podem voar, grasnar (quack), nadar e podem ser mostrados na tela.
O sistema atualmente possui apenas um marreco (Mallard Duck) e o seu chefe pede para você implementar duas coisas:

1. Adicionar um pato de madeira
2. Adicionar um pato biônico

Para iniciar com as soluções, podemos afirmar que, com certeza, teremos uma classe abstrata genérica Duck, a qual será herdada pelos subtipos RubberDuck, MallardDuck e BionicDuck.
Essa classe possui os métodos fly(), quack(), swim() e display(). Mas podemos afirmar que um pato de madeira nem grasna nem voa, e um pato biônico voa de forma diferente
de um marreco. Como implementar essas novas atualizações no sistema?

# Solução inadequada 1
Poderíamos deixar os métodos fly() e quack() como métodos abstratos e sobrescrevê-los nas classes filhas, mudando o comportamento do método em cada classe.
Mas por quê isso seria inadequado? Suponhamos que, ao invés de um sistema com 3 tipos de patos, o sistema tenha 5000 patos. Sobrescrever 5000 vezes os mesmos dois métodos
, podendo ter patos em que o comportamento é similar, é bastante inviável.

# Solução inadequada 2
Retirar os métodos fly() e quack() da classe abstrata Duck e colocá-las nas interfaces Flyable e Quackable, respectivamente. Após isso, fazer cada subtipo de Duck implementar
as duas interfaces. O problema é bastante similar ao da primeira solução, **nessa solução não há reuso de código**. Teríamos que implementar esses dois métodos em todos os subtipos
de patos.

# Solução adequada
Para ter uma solução adequada, poderíamos retirar os métodos fly() e quack(), como na solução anterior, e colocá-los nas interfaces FlyStrategy e QuackStrategy, respectivamente.
Por quê fazer isso? Um princípio de design fala que **__devemos identificar as partes que mudam no código e separá-las das que não variam__**. Nesse caso, tanto voar como grasnar são 
comportamentos que mudam dependendo da subclasse, portanto devemos separar os métodos da classe Duck e, por **composição**, criar os atributos __flyStrategy__ e __quackStrategy__.
Após criadas as interfaces, criaremos as estratégias concretas de vôo e de grasno, as quais irão implementar sua respectiva interface de estratégia.
Dessa forma, nós obtemos um design flexível, em que as estratégias podem ser alteradas em tempo de execução sem alterar nada do código (devido à composição).
**(Olhar o código para melhor entendimento)**
