# Introdução
O padrão observador é um padrão comportamental, em que, basicamente, há um **Sujeito** (ou publicador), e vários **Observadores** (ou assinantes). Formalmente, um padrão que **determina uma relação de um-para-muitos (one-to-many) entre objetos, em que quando o estado do sujeito mudar, os observadores são notificados e atualizados automaticamente.** Um assinante pode pedir para "cancelar a assinatura" ou "assinar" quando quiser.

## Implementação
![Diagrama UML Observer Impl](https://github.com/jonatas-lima/design-patterns/blob/master/uml/observer_impl.png)

## Problema proposto
Você contratado para desenvolver um sistema meteorológico em que, cada vez que novos dados de temperatura e umidade sejam fornecidos, devem ser mostrados os dados atuais e os dados estatísticos do clima.

## Solução
A princípio, teremos um sujeito, responsável por notificar e atualizar os observadores cada vez que haja mudança no estado. Chamaremos esse sujeito de WeatherData e os observadores de CurrentConditionsDisplay e StatisticsDisplay. o WeatherData implementa uma interface Observable, enquanto os observadores implementam as interfaces Observer e DisplayElement. O WeatherData possui uma estrutura de dados que armazena os assinantes do tipo Observer, isso permite que classes concretas diferentes possam ser armazenadas como um mesmo tipo.

## Diagrama final
![Diagrama final Observer](https://github.com/jonatas-lima/design-patterns/blob/master/uml/observer.png)
