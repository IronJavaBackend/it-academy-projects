# EXERCICI ROCKETS

## FASE 1
Volem fer un software de carreres de coets.  
Un coet està identificat per un codi de 8 caràcters i un número de propulsors.

Realitza els següents passos:
1. Creem dos coets amb els codis “x” I “LDSFJA32”. El primer coet tindrà tres propulsors i el segon sis propulsors.

2. Mostrar a pantalla el codi dels coets i el número de propulsors que té.  
  
## FASE 2
Volem millorar el software perquè el propulsor tingui una potència màxima.

Modifiquem en el main anterior:

1. Creem dos coets amb els codis “32WESSDS” I “ ”. El primer coet tindrà tres propulsors (potència: 10,30,80) i el segon sis propulsors (potència: 30,40,50,50,30,10).

2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència màxima de cada propulsor.

Output:
```
32WESSDS: 10,30,80  
LDSFJA32: 30,40,50,50,30,10
```

## FASE 3  
Per la fase 3 modificarem els propulsors afegint també una potencia actual. Un propulsor tindrà una potència màxima (no la pot superar) i una potencia actual (la potencia que té el propulsor en aquell moment). Tots els propulsors tindran una potència actual que començarà amb 0.

El coet tindrà dos mètodes, accelerar o frenar. Aquests mètodes indicaran la potència objectiu de cada propulsor, tingues en compte que cada propulsor ha de saber si ha d'augmentar o baixar d'un en un la seva potencia i de forma independent (threads!).

Com a resultat hauries de veure per pantalla cada propulsor amb el fil adequat pujant o baixant la potencia segons hagis indicat a l'ordre d'accelerar o frenar


## FASE 4 (opcional d’algoritmia)
Ara suposem que el coet està volant a l’espai sense fricció. La velocitat la podem calcular de la següent manera:
```
v = vo + 100 √𝑃𝑇
```

vo: és la velocitat inicial (la velocitat a la que anava abans de fer aquest càlcul)

PT: és la suma de la potencia de cada propulsor

Donada una velocitat inicial, s'ha de calcular la Potencia total necessària, repartir-la entre els coets (tenint en compte el seu màxim) i accelerar d'acord amb això, de no poder accelerar fins a la velocitat indicada per falta de potència s'ha d'informar per pantalla.