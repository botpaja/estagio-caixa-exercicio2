# estagio-caixa-exercicio 2
Threads

2) Nesta prática vamos utilizar Threads para simular o funcionamento de uma central de
mensagens de celular (SMS). O objetivo é implementar um programa no modelo
produtor/consumidor e simular o processo de recebimento e o encaminhamento de
mensagens SMS. A nossa central irá receber mensagens provenientes de muitos
celulares e várias mensagens podem chegar ao mesmo tempo. A central deve então
encaminhar cada mensagem para o respectivo destino, que também é um celular. Na
verdade, iremos simular a chegada das mensagens utilizando threads produtoras de
mensagens. As produtoras irão criar uma mensagem qualquer e inserir esta mensagem
em uma fila de mensagens F que fica no aplicativo servidor. O encaminhamento das
mensagens para o destino será feira por uma thread consumidor, que irá pegar as
mensagens na fila F e encaminhá-las uma a uma.
