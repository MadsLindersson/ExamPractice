package org.example.exampractice.Repository;

import org.example.exampractice.Model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.exampractice.Model.Question.Subjects.*;
import static org.example.exampractice.Model.Question.Subjects.ITF;

@Repository
public class QuestionsRepository {
    public List<Question> makeListOfQuestions()   {
        List<Question> questions = new ArrayList<Question>();

        int count = 1;
//1. semester:--------------------------------------------------------------------------------------------------------//
//Programmerings spørgsmål:-------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er forskellen på en LinkedList og en ArrayList?",
                """
                        En LinkedList bruger noder til at lagre data, hvor hver node indeholder en reference til næste (og eventuelt forrige) node. Det gør indsættelse og sletning hurtigere midt i listen, men adgang til elementer langsom.
                        
                        En ArrayList lagrer data i en kontinuerlig blok af hukommelse, hvilket gør adgang til elementer hurtig, men indsættelse og sletning langsommere på grund af behovet for at flytte elementer.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en LinkedList?",
                """
                        En LinkedList er en datastruktur, hvor elementerne er organiseret som noder, der hver indeholder en værdi og en reference (peger) til den næste node i listen. Denne struktur gør det nemt at indsætte og fjerne elementer i midten af listen, men adgang til elementer er langsommere end andre datastrukture som f.eks. ArrayList.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er Singleton-patternet? Og hvad er formålet med dette?",
                """
                        Singleton-patternet er et designmønster, der sikrer, at en klasse kun har én instans, og giver global adgang til denne instans.
                        
                        Formålet er at kontrollere ressourceforbrug, fx ved at dele en fælles instans, og sikre konsistens, når en enkelt globalt tilgængelig instans er nødvendig.
                        
                        Eksempel:
                        I en databaseforbindelse kan Singleton-patternet bruges til at sikre, at der kun oprettes én forbindelse til databasen, som hele applikationen deler. Dette reducerer ressourceforbrug og forhindrer konflikter ved flere forbindelser.""")
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en Iterator i forbindelse med en LinkedList?",
                """
                        En Iterator i forbindelse med en LinkedList er et objekt, der gør det muligt at traversere (gennemgå) listen element for element. Den giver metoder som hasNext() for at kontrollere, om der er flere elementer, og next() for at hente det næste element i listen. Iteratoren hjælper med at navigere gennem en LinkedList uden at bruge indeksering direkte.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et loop?",
                """
                        Et loop er en kontrolstruktur i programmering, der gentager en kodeblok flere gange, så længe en bestemt betingelse er opfyldt. Der findes forskellige typer loops, såsom for-loops, while-loops og do-while-loops, der bruges afhængigt af, hvordan og hvor mange gange gentagelsen skal ske.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et for-loop?",
                """
                        Et for-loop er en type loop, der gentager en kodeblok et bestemt antal gange. Det består af tre dele: en initialisering, hvor tælleren starter, en betingelse, der afgør, hvornår loopet skal stoppe, og en opdatering, hvor tælleren ændres efter hver gentagelse. For-loops er praktiske, når du ved, hvor mange gange koden skal gentages, og du kan kontrollere, hvordan tælleren ændres undervejs.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et nestet for-loop?",
                """
                        Et nestet for-loop er et for-loop, der er placeret inden i et andet for-loop. Det bruges, når du skal gentage en handling flere gange for hver gentagelse af et andet loop. Et eksempel kunne være at printe en række mønstre, hvor det ydre loop styrer antallet af linjer, og det indre loop styrer antallet af tegn i hver linje.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et while-loop?",
                """
                        Et while-loop er en type loop, der gentager en kodeblok, så længe en bestemt betingelse er sand. Betingelsen tjekkes før hver iteration, og loopet stopper, når betingelsen ikke længere er opfyldt. Det bruges, når du ikke nødvendigvis ved, hvor mange gange loopet skal køre på forhånd, men du vil fortsætte, indtil en bestemt betingelse ændres.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et do-while-loop?",
                """
                        Et do-while-loop er en type loop, der ligner et while-loop, men forskellen er, at betingelsen først tjekkes efter, at kodeblokken er blevet kørt én gang. Det betyder, at koden altid køres mindst én gang, selvom betingelsen ikke er opfyldt fra starten. Det bruges, når du vil sikre, at koden bliver udført mindst én gang, før du tjekker, om den skal gentages.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et enhanced for-loop? (for-each-loop)",
                """
                        Et enhanced for-loop, også kaldet et for-each-loop, er et for-loop, der gør det nemmere at iterere gennem elementer i en samling, som f.eks. en liste eller et array. I stedet for at bruge en tæller, som i et almindeligt for-loop, hentes hvert element direkte, én ad gangen, og kan bruges i løbet af iterationen. Det er praktisk, når du kun skal bruge elementerne i en samling, uden at skulle bekymre dig om indeks.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et if-statement?",
                """
                        Et if-statement er en kontrolstruktur, der bruges til at udføre en kodeblok, hvis en bestemt betingelse er sand. Hvis betingelsen er opfyldt, kører koden inden for if-blokken; hvis ikke, springes den over. Det bruges til at træffe beslutninger i koden og styre flowet afhængigt af, om en betingelse er sand eller falsk.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvilke 3 forskellige typer af if-statements findes der?",
                """
                        De tre typer af if-statements er:
                        
                        If-statement: Udfører en kodeblok, hvis en betingelse er sand.
                        Else-statement: Udfører en alternativ kodeblok, hvis if-betingelsen ikke er sand.
                        Else if-statement: Bruges til at tjekke en ekstra betingelse, hvis den første if-betingelse ikke var sand.
                        Disse gør det muligt at lave flere beslutninger i koden, afhængigt af hvilke betingelser der er opfyldt.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en variabel?",
                """
                        En variabel er en opbevaringsplads i hukommelsen, der bruges til at gemme data, som kan ændres under programmets kørsel. Hver variabel har et navn og en datatype (som f.eks. int, double eller String), som bestemmer, hvilken type data den kan indeholde. Variabler bruges til at opbevare information, som programmet kan arbejde med, f.eks. tal, tekst eller objektreferencer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en primitiv type?",
                """
                        En primitiv type er en grundlæggende datatype, der ikke er et objekt og ikke kan opdeles i mindre enheder. Primitiv types bruges til at gemme simple værdier som tal, tegn eller boolean værdier. Eksempler på primitive typer i Java er:
                        int, double, char, boolean, byte, short, long, float.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en metode?",
                """
                        En metode er en kodeblok, der udfører en bestemt opgave og kan kaldes for at køre den funktionalitet. Metoder bruges til at organisere koden i små, genanvendelige enheder, hvilket gør programmerne mere strukturerede og lettere at vedligeholde. Metoder kan tage input (parametre), udføre en opgave og eventuelt returnere et resultat.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et objekt?",
                """
                        Et objekt er en instans af en klasse, som indeholder data (attributter) og funktioner (metoder), der arbejder med disse data. Objekter repræsenterer virkelige eller abstrakte entiteter i et program og bruges til at organisere og strukturere kode. Hvert objekt har sin egen tilstand og kan interagere med andre objekter gennem metoder.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en klasse?",
                """
                        En klasse er en skabelon eller blueprint, der definerer, hvordan et objekt skal se ud og hvilke funktioner det skal have. Klassen beskriver attributter (egenskaber) og metoder (funktioner), som objekter af denne klasse vil have. Klassen er grundlaget for at oprette objekter, og objekterne er instanser af klassen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvem skulle du tage og oprette forbindelse med på LinkedIn?",
                """
                        Jens Kristian Ruben Hansen & Mads Lindersson. (Links nede i højre hjørne)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en escape sequence? Og hvad er formålet med den?",
                """
                        En escape sequence er en kombination af tegn, der starter med en backslash (\\), og bruges til at repræsentere specialtegn i en streng.
                        
                        Formål:
                        Escape-sekvenser gør det muligt at inkludere tegn, der ellers ville være vanskelige at skrive direkte, f.eks.:
                        
                        \\n (ny linje)
                        \\t (tabulator)
                        \\" (anførselstegn i en streng)
                        \\\\ (backslash)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad betyder precedence?",
                """
                        Precedence bestemmer rækkefølgen, hvori operationer udføres. Her er nogle vigtige operatorer i rækkefølge fra høj til lav precedence:
                        
                        Parenteser: ( )
                        Unære operatorer: ++, --, !
                        Multiplikation og division: *, /, %
                        Addition og subtraktion: +, -
                        Sammenligning: <, >, <=, >=
                        Lighedsoperatorer: ==, !=
                        Logisk OG: &&
                        Logisk ELLER: ||
                        Tildeling: =, +=, -=, *=, /=
                        Højere precedence betyder, at operationen udføres før dem med lavere precedence, medmindre parenteser ændrer rækkefølgen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et parameter? (ift. metoder)",
                """
                        En parameter er en variabel, der gives som input til en metode for at påvirke dens funktion.
                        
                        Når en metode kaldes, kan den modtage værdier (argumenter), som matches med parametrene.
                        
                        Formål: Parametre gør metoder fleksible, så de kan udføre beregninger eller handlinger baseret på forskellig input.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad vil det sige at 'parameter overføre'?",
                """
                        Parameteroverførsel betyder at sende værdier (argumenter) til en metode gennem dens parametre.
                        
                        Der er to hovedtyper:
                        
                        Pass-by-value (værdi) – Metoden får en kopi af værdien (bruges til primitive typer i Java).
                        Pass-by-reference (reference) – Metoden får en reference til det oprindelige objekt (bruges til objekter i Java).
                        I Java overføres primitive typer ved værdi, mens objekter overføres ved reference til værdien (dvs. referencen kopieres, men objektet ændres, hvis metoden modificerer det).
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en retur værdi?",
                """
                        En returværdi er den værdi, en metode sender tilbage efter udførelse.
                        
                        Formål: Gør det muligt at bruge metodens resultat i videre beregninger.
                        
                        Metodens returtype bestemmer, hvilken type værdi den kan returnere (f.eks. int, double, String). Metoder uden returværdi har void som returtype.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad betyder det at 'overloade' en metode eller konstruktør?",
                """
                        At overloade en metode eller konstruktør betyder at definere flere versioner af den samme metode eller konstruktør med samme navn, men med forskellige parameterlister (forskellige antal eller typer af parametre).
                        
                        Formålet er at gøre koden mere fleksibel og genanvendelig, så den samme metode kan håndtere forskellige typer input uden at ændre navnet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad betyder 'static'?",
                """
                        static betyder, at en variable eller metode tilhører klassen i stedet for et specifikt objekt. Det kan bruges uden at oprette et objekt, og det er delt af alle objekter af klassen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en fencepost-fejl, og hvordan kan man undgå den i programmering?",
                """
                        En fencepost-fejl opstår, når du glemmer at starte eller slutte med det rigtige punkt, som fx et komma. Tænk på en liste med tal: 1, 2, 3, 4, 5. Hvis du laver en løkke, der skal tilføje kommaer mellem tallene, vil du komme til at tilføje et komma efter det sidste tal (fx 1, 2, 3, 4, 5,). For at undgå denne fejl, skal du starte med et tal og så begynde at tilføje kommaer inde i løkken – ikke før. Det betyder, at du undgår at ende med et ekstra komma til sidst.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et sentinel loop?",
                """
                        Et sentinel loop er en løkke, der fortsætter, indtil den møder en bestemt værdi (kaldet sentinelværdien), som stopper løkken. Det bruges typisk i while- eller do-while-loops for at afslutte en løkke, når en bestemt betingelse er opfyldt, som f.eks. når brugeren indtaster "0" for at afslutte.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er boolean zen?",
                """
                        Boolean Zen handler om at undgå redundans, især når du arbejder med boolske værdier. Det betyder at skrive kode på en enkel måde, f.eks. at undgå at tjekke, om en værdi er true eller false, når det allerede er implicit i betingelsen. Det gør koden lettere at læse og mere effektiv.
                        
                        Ikke boolean zen: if(isTrue == true)
                        Boolean zen:      if(isTrue)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et Scanner objekt?",
                """
                        Et Scanner-objekt bruges til at læse input fra brugeren i Java. Det gør det muligt at hente data, som f.eks. tekst eller tal, fra tastaturet eller en fil.
                        
                        Scanner scanner = new Scanner(System.in);
                        Scanner scanner = new Scanner(new File("filnavn.txt"));
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en line og en token? (ifb. med Scanner object)",
                """
                        En line er en hel linje af tekst, der læses på én gang, mens en token er et enkelt ord eller en værdi, der opdeles af mellemrum eller andre separatorer. Typisk læser man først en linje med nextLine(), og derefter bruger man en ny Scanner til at læse tokens fra den linje med next().
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et PrintStream objekt?",
                """
                        Et PrintStream-objekt bruges i Java til at sende output, som f.eks. tekst, til en destination som en fil eller konsol. Det giver metoder som print() og println() til at skrive data.
                        
                        Man kan oprette et PrintStream-objekt for at skrive til en fil eller en anden output-strøm, ved at angive den ønskede destination, som en fil.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er exceptions?",
                """
                        Exceptions i Java er fejl, der sker, mens programmet kører, og som kan stoppe programmet. Når en exception opstår, kan programmet håndtere den med try-catch-blokke.
                        
                        Hvis en metode kan forårsage en fejl, kan den bruge throws til at fortælle, at den kan kaste en exception, som skal håndteres andre steder.
                        
                        Exceptions bruges til at vise problemer, som f.eks. at dele med nul eller åbne en fil, der ikke findes. Du kan også lave dine egne exceptions for at håndtere specifikke fejl.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et objekts 'state' og 'behavior'?",
                """
                        Et objekts state er de data, det gemmer (f.eks. værdier af variabler), mens behavior er de handlinger, objektet kan udføre (f.eks. metoder). State beskriver, hvad objektet "er", og behavior beskriver, hvad objektet "gør".
                        
                        Eksempel: En radio kan være et objekt. Dens state kunne være ting som den nuværende volumen og frekvens, som radioen gemmer. Dens behavior kunne være handlinger som at tænde/slukke, ændre volumen eller skifte station.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad bruges keyword 'this' til?",
                """
                        "this" bruges til at referere til det aktuelle objekt, som metoden eller konstruktøren arbejder med. Det hjælper med at adskille objektets variabler fra metoder eller parametre, hvis de har samme navn.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er nedarv? Og hvad er formålet med dette?",
                """
                        Nedarvning betyder, at en subklasse kan arve egenskaber og metoder fra en superklasse. Formålet er at genbruge kode, så den nye subklasse får funktionalitet fra superklassen uden at skulle skrive den samme kode igen. Dette gør det nemmere at udvide og vedligeholde programmet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad betyder det at override en metode eller konstruktør?",
                """
                        
                        At override en metode eller konstruktør betyder, at en subklasse skriver sin egen version af en metode eller konstruktør, som allerede findes i superklassen. Metoderne og konstruktørerne i subklassen skal have samme navn som dem i superklassen. Det bruges til at ændre, hvordan metoden eller konstruktøren fungerer i subklassen, så den kan tilpasses subklassens behov.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et array?",
                """
                        Et array er en statisk liste, der indeholder værdier af samme type. Denne liste er indekseret, hvilket betyder, at man kan tilgå elementerne ved at bruge deres tilhørende indeks. I et array starter indekseringen altid fra 0, så det første element i arrayet har indeks 0, det næste har indeks 1, og så videre. Et array har en fast størrelse, som bestemmes ved oprettelsen og kan ikke ændres senere.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en ArrayList?",
                """
                        En ArrayList er en dynamisk liste i Java, der automatisk ændrer størrelse, når elementer tilføjes eller fjernes. Den gemmer elementer af samme type og tilbyder metoder som add(), remove(), og get(). Når et element fjernes, bliver listen automatisk rykket sammen, så der ikke opstår huller. Dette gør ArrayList fleksibel, da den håndterer både størrelseændring og omarrangering af elementer automatisk, i modsætning til et statisk array, der har en fast størrelse.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en wrapper klasse?",
                """
                        En wrapper klasse i Java er en klasse, der indpakker primitive datatyper som objekter. Hver primitiv type har en tilsvarende wrapper klasse, f.eks. Integer for int og Character for char. Wrapper klasser gør det muligt at bruge primitive typer i objektsamlinger som ArrayList og tilbyder nyttige metoder som konvertering og matematiske operationer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er Comparable interface? Og hvad er en CompareTo() metode?",
                """
                        Comparable interface i Java gør det muligt at sammenligne objekter af en klasse, så de kan sorteres. Klassen implementerer Comparable og definerer en compareTo() metode for at bestemme rækkefølgen af objekterne.
                        
                        compareTo() metode bruges til at sammenligne to objekter. Den returnerer:
                        
                        Et negativt tal, hvis objektet er mindre.
                        0, hvis objekterne er lige.
                        Et positivt tal, hvis objektet er større.
                        
                        For at sortere en liste, der implementerer Comparable, bruger man Collections.sort();
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er relational operators?",
                """
                        Relational operators i Java bruges til at sammenligne to værdier. De returnerer en boolean værdi (true eller false). De mest almindelige er:
                        
                        == (lig med)
                        != (ikke lig med)
                        < (mindre end)
                        > (større end)
                        <= (mindre end eller lig med)
                        >= (større end eller lig med)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er logical operators?",
                """
                        Logical operators i Java bruges til at kombinere eller ændre betingelser. De mest almindelige er:
                        
                        && (logisk AND): Returnerer true, hvis begge betingelser er true.
                        || (logisk OR): Returnerer true, hvis mindst én betingelse er true.
                        ! (logisk NOT): Ændrer en betingelse, dvs. returnerer true hvis betingelsen er false, og vice versa.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en cumulative sum?",
                """
                        En cumulative sum (eller kumulativ sum) er en løbende sum af værdier, hvor hver værdi i rækken tilføjes til den forrige sum. Det betyder, at hver sum er den samlede værdi af alle tidligere tal plus det aktuelle tal.
                        
                        Der bruges += til at lægge et tal til en eksisterende værdi.
                        
                        Der kan også bruges *= og /=, de vil henholdsvis multiplicere og dividere.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er konstanter? Og hvad er formålet med disse?",
                """
                        Konstanter er værdier, der ikke kan ændres, efter de er blevet tildelt. I Java defineres de med final keywordet. Formålet med konstanter er at sikre, at en værdi forbliver konstant gennem hele programmet. Et typisk eksempel er moms-satsen, som ikke ændres i løbet af programmet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er pseudo kode? Og hvad er formålet med dette?",
                """
                        Pseudo kode er en uformel beskrivelse af et program eller en algoritme, skrevet på et letforståeligt sprog, der ligner programmering, men uden at følge syntaksen i et bestemt programmeringssprog. Formålet med pseudo kode er at planlægge og beskrive logikken i et program på en enkel og læsbar måde, før man skriver den faktiske kode. Det hjælper med at forstå algoritmen og strukturen, uden at fokusere på detaljer i syntaks.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en switch?",
                """
                        En switch i Java er en kontrolstruktur, der bruges til at vælge mellem flere mulige værdier baseret på en variabel. Den sammenligner en værdi med flere cases og udfører den kode, der matcher. Man bruger typisk en switch, når tjekket bliver for stort eller kompliceret til at håndtere effektivt med if-statements. Hver case afsluttes normalt med en break for at forhindre, at programmet fortsætter til næste case. Hvis ingen case matcher, kan en default case bruges.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er printf? Og hvad er formålet med denne?",
                """
                        printf er en metode i Java, der bruges til at formatere og udskrive tekst til konsollen. Formålet med printf er at give kontrol over, hvordan data vises, f.eks. ved at specificere antal decimaler, bredden på tekst og justering.
                        
                        Eksempel:
                        double price = 12.3456;
                        System.out.printf("Prisen er: %.2f\\n", price);  // Udskriver: Prisen er: 12.35
                        I dette eksempel bruges %.2f til at vise prisen med to decimaler.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er multiple dimensional arrays?",
                """
                        Multiple dimensional arrays er arrays, der indeholder andre arrays som elementer. De bruges til at repræsentere data i flere dimensioner, som f.eks. en matrix (2D array) eller en 3D struktur.
                        
                        Eksempel på et 2D array:
                        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                        Her er matrix et 2D array med 3 rækker og 3 kolonner.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad betyder det at traversere?",
                """
                        At traversere betyder at gennemløbe eller iterere gennem elementerne i en datastruktur, som f.eks. et array eller en liste. Formålet er ofte at tilgå, ændre eller behandle hvert element i strukturen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er Math biblioteket?",
                """
                        Math biblioteket i Java indeholder en række matematiske funktioner og konstanter, som gør det nemt at udføre beregninger som f.eks. trigonometri, logaritmer, absolutte værdier og mere.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er Math.random?",
                """
                        Math.random() i Java er en metode, der genererer et tilfældigt decimaltal mellem 0 (inklusive) og 1 (eksklusive). Det bruges ofte til at skabe tilfældige værdier i programmer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er fields?",
                """
                        Fields i Java er variabler, der er defineret inden for en klasse. De bruges til at gemme data eller tilstand for objekterne af klassen. Fields kan være af forskellige datatyper og kan have forskellige adgangsniveauer (f.eks. private, public).
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en konstruktør?",
                """
                        En konstruktør i Java er en speciel metode, der bruges til at initialisere objekter. Den har samme navn som klassen og kaldes automatisk, når et objekt oprettes. Konstruktøren bruges til at tildele værdier til felterne i objektet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvordan kan man have flere konstruktører i en klasse?",
                """
                        
                        Man kan have flere konstruktører i en klasse ved at bruge konstruktør overloading. Det betyder, at man definerer flere konstruktører med samme navn, men med forskellige parameterlister (forskellige antal eller typer af parametre). Dette gør det muligt at initialisere objekter på forskellige måder.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er en toString() metode?",
                """
                        En toString() metode i Java er en metode, der returnerer en strengrepræsentation af et objekt. Den bruges ofte til at få en menneskelig læsbar beskrivelse af objektet. Hvis den ikke er overskrevet i en klasse, returnerer den som standard objektets hukommelsesadresse.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er encapsulation?",
                """
                        Encapsulation i Java er en objektorienteret princip, der betyder at skjule objektets interne data og kun give adgang til dem gennem offentlige metoder (getters og setters). Det beskytter objektets tilstand og sikrer, at data kun kan ændres på en kontrolleret måde.
                        (private/protected)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er et interface?",
                """
                        Et interface i Java er en kontrakt, der definerer metoder, som en klasse skal implementere. Det indeholder kun metodernes signaturer (ingen implementering), og en klasse, der implementerer et interface, skal definere alle de metoder, der er angivet i interfacet.
                        Der bruges keyword 'Implements' for at bruge et interface.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvad er polymorphism?",
                """
                        Polymorphism i Java betyder, at en metode eller et objekt kan have flere former. Det gør det muligt at bruge den samme metode med forskellige typer objekter, og metoden kan opføre sig forskelligt afhængigt af objektet, der kalder den. Polymorphism gør koden mere fleksibel og genbrugelig, da du kan arbejde med objekter af forskellige klasser på en ensartet måde.
                        
                        Eksempel: En metode, der kaldes på et objekt, kan give forskellig adfærd afhængigt af om objektet er af type Hund eller Kat.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "Hvordan definerer man en metode i Java, og hvad er de nødvendige komponenter i en metodedeklaration?",
                """
                        I Java defineres en metode med følgende komponenter:
                        
                        Returtype: Angiver typen af værdi, som metoden returnerer (f.eks. int, String, void hvis den ikke returnerer noget).
                        Metodenavn: Navnet på metoden.
                        Parametre: En liste af variabler, der er adskilt med kommaer, som metoden kan modtage. Hver parameter har en type og et navn. (Kan være by value og by reference)
                        Metodekrop: De klammer {}, der indeholder kroppen af metoden, hvor koden udføres.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                1,
                "",
                """
                        
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

//2. semester:--------------------------------------------------------------------------------------------------------//
//Programmerings spørgsmål:-------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er en Unit test? Og hvad er formålet med dette?",
                """
                        En unit test er en testmetode, der verificerer funktionaliteten af en enkelt enhed eller komponent i en applikation, typisk en individuel funktion eller klasse, isoleret fra resten af systemet.
                        
                        Formålet med unit tests er at sikre, at hver enhed fungerer korrekt, finde fejl tidligt i udviklingsprocessen og understøtte vedligeholdelse ved at fange utilsigtede ændringer i koden.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er forskellen mellem checked exceptions og unchecked exceptions?",
                """
                        Checked exceptions er undtagelser, der skal håndteres eksplicit med en try-catch blok eller erklæres med throws i metoden. De er typisk forudsigelige fejl, som kan opstå under normale forhold, f.eks. fil-læsning.
                        
                        Unchecked exceptions (runtime exceptions) er undtagelser, der ikke kræver eksplicit håndtering. De opstår typisk som følge af programmeringsfejl, som f.eks. nul-reference eller array out-of-bounds.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad betyder 'server-side' i relation til en webapplikation?",
                """
                        Server-side refererer til backend i en webapplikation, hvor al forretningslogik, datahåndtering og serverkommunikation foregår. Frontend er den del af applikationen, der kører på klientens enhed (browser), og som brugeren interagerer med. Server-side (backend) leverer data og funktionalitet til frontend (klientsiden).
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er formålet med at bruge packages i en Spring-applikation?",
                """
                        Formålet med at bruge packages i en Spring-applikation er at organisere koden i logiske enheder, hvilket gør den lettere at vedligeholde og sikrer, at relaterede klasser og komponenter er samlet. Packages hjælper med at opdele applikationen i moduler og understøtter bedre struktur, sikkerhed og styring af afhængigheder. I et Spring Boot-projekt kan dette eksempelvis omfatte packages som Controller, Model, Service og Repository, hvor hver package indeholder de relevante klasser og komponenter.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad bruges 'Static'-mappen til i en Spring-applikation?",
                """
                        I en Spring-applikation bruges 'static'-mappen til at gemme statiske ressourcer som billeder, CSS-filer, JavaScript og andre filer, der skal være tilgængelige direkte for klienten (browseren). Disse filer kan tilgås uden behov for at blive behandlet af en controller
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad bruges ’Template’-mappen til i en Spring applikation?",
                """
                        I en Spring-applikation bruges 'template'-mappen til at opbevare filer, der genererer HTML-sider, som vises for brugeren. Disse filer bruger ofte skabelonsystemer som Thymeleaf til at indsætte data dynamisk.
                        """)
        );
        count++;


//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er en Try/Catch block? Og hvad er formålet med den?",
                """
                        En Try/Catch block bruges til at håndtere undtagelser (fejl) i Java. Koden inden for try-blokken udføres, og hvis en undtagelse opstår, fanges den af catch-blokken. Formålet er at forhindre, at programmet crasher ved fejl, og i stedet håndtere dem på en kontrolleret måde, f.eks. ved at logge fejlinformation eller give brugeren en passende fejlmeddelelse.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        //Skal deles op i 2 spørgsmål - Java -> database & Spring -> database
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvordan opretter man forbindelse til en database i Java?",
                """
                        For at oprette forbindelse til en database i Java benyttes JDBC (Java Database Connectivity). Processen indebærer, at man først indlæser den relevante database-driver, som gør det muligt for Java-applikationen at kommunikere med den specifikke database. Herefter opretter man en forbindelse til databasen ved hjælp af en URL, brugernavn og adgangskode, hvilket giver applikationen adgang til at udføre SQL-forespørgsler og opdatere data i databasen. Denne forbindelse håndteres gennem et Connection-objekt, som anvendes til at kommunikere med databasen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er et Resultset i forbindelse med SQL?",
                """
                        Et ResultSet i forbindelse med SQL er et objekt i Java, der indeholder data returneret fra en SQL-forespørgsel. Det giver mulighed for at navigere gennem rækkerne i resultatet og hente kolonneværdier for hver række. ResultSet bruges typisk i forbindelse med en SELECT-forespørgsel og giver metoder til at få adgang til de enkelte dataelementer, såsom getString(), getInt() eller getDate().
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad gør en BeanPropertyRowMapper?",
                """
                        En BeanPropertyRowMapper i Java bruges til at mappe rækker fra et ResultSet til Java-objekter (beans). Når du bruger denne klasse, kan den automatisk konvertere kolonneværdierne fra databasen til de tilsvarende felter i et Java-objekt baseret på navneoverensstemmelse mellem kolonnerne og objektets egenskaber. Det gør det lettere at håndtere data fra databasen og omdanne dem til objekter uden behov for manuel mapping af hver kolonne.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er forskellen på inline, internal og external CSS?",
                """
                        Forskellen mellem inline, internal og external CSS ligger i, hvor stilen defineres og hvordan de anvendes i forhold til hinanden:
                        
                        Inline CSS defineres direkte i HTML-elementets style-attribut og gælder kun for det specifikke element. Denne form for CSS har højeste prioritet.
                        Internal CSS defineres i et <style>-tag i <head>-sektionen af HTML-dokumentet og gælder for elementer i samme dokument. Denne form af CSS har lavere prioritet end inline CSS.
                        External CSS defineres i en separat CSS-fil, som linkes til HTML-dokumentet. Denne form har lavest prioritet og bruges til at anvende ensartet styling på tværs af flere HTML-sider.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvem skulle du tage og oprette forbindelse med på LinkedIn?",
                """
                        Jens Kristian Ruben Hansen & Mads Lindersson. (Links nede i højre hjørne)
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad bruges @GetMapping til i Spring?",
                """
                        @GetMapping i Spring bruges til at oprette en metode i en controller, som håndterer HTTP GET-anmodninger. Det betyder, at når en bruger f.eks. besøger en bestemt URL, vil metoden blive kaldt og returnere data eller en webside til brugeren.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvordan adskiller @PostMapping sig fra @GetMapping?",
                """
                        @PostMapping og @GetMapping bruges begge i Spring til at håndtere HTTP-anmodninger, men de adskiller sig i, hvordan de bruges:
                        
                        @GetMapping håndterer HTTP GET-anmodninger, som bruges til at hente data eller vise en webside. Data, der sendes med GET-anmodningen, vises i URL'en, hvilket gør det lettere at se og dele.
                        
                        @PostMapping håndterer HTTP POST-anmodninger, som bruges til at sende data til serveren, f.eks. når en bruger indsender et formular. Post-anmodninger viser ikke data i URL'en, hvilket gør det mindre synligt, men det betyder ikke, at dataene er krypteret.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad betyder 'lagdelt arkitektur' i Spring?",
                """
                        Lagdelt arkitektur i Spring refererer til opdelingen af en applikation i separate lag, hvor hvert lag har et specifikt ansvar. De typiske lag er:
                        
                        Controller-lag: Håndterer HTTP-anmodninger og kommunikerer med service-laget.
                        Service-lag: Indeholder forretningslogik og kommunikationen mellem controller og repository-lag.
                        Repository-lag: Håndterer datatilgang og interagerer med databasen.
                        Formålet med lagdelt arkitektur er at opretholde en ren opdeling af ansvarsområder, hvilket gør applikationen lettere at vedligeholde og udvide.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad gør @Autowired i Spring?",
                """
                        @Autowired i Spring bruges til automatisk at injicere afhængigheder i en klasse. Det betyder, at Spring automatisk finder og indsætter de nødvendige objekter (f.eks. services eller repositories) i en klasse, uden at du selv behøver at skabe dem manuelt. Det hjælper med at gøre koden mere fleksibel og lettere at vedligeholde.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er en HashMap, og hvornår bør man bruge den?",
                """
                        En HashMap er en datastruktur i Java, der lagrer nøgle-værdi-par, hvor hver nøgle er unik, og værdien er tilknyttet en specifik nøgle. Den giver hurtig adgang til værdier baseret på nøgler.
                        
                        Man bør bruge en HashMap, når man har brug for effektiv lagring og opsætning af data, hvor man hurtigt skal kunne hente, indsætte eller opdatere værdier ved hjælp af nøgler.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvordan fungerer 'final' keyword i Java i relation til variabler, metoder og klasser?",
                """
                        I Java bruges 'final' som et keyword til at angive, at noget ikke kan ændres:
                        
                        Variabler: Når en variabel er deklareret som final, kan dens værdi ikke ændres efter initialisering.
                        Metoder: Når en metode er deklareret som final, kan den ikke blive overskrevet i en underklasse.
                        Klasser: Når en klasse er deklareret som final, kan den ikke blive nedarvet eller udvidet af andre klasser.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvordan fungerer Dependency Injection i Spring, og hvorfor er det nyttigt?",
                """
                        Dependency Injection (DI) i Spring er en teknik, hvor Spring containeren automatisk injicerer afhængigheder (f.eks. objekter eller services) i en klasse, i stedet for at klassen selv skal oprette eller finde disse afhængigheder.
                        
                        En almindelig måde at implementere DI i Spring er ved hjælp af @Autowired-annotation, som automatisk injicerer den nødvendige afhængighed i et felt, en konstruktor eller en setter-metode.
                        
                        DI gør det lettere at teste, vedligeholde og udvide applikationen, da det løsner koblingen mellem komponenterne og fremmer genbrug af objekter. Det gør koden mere fleksibel og modulær.
                        """)
        );
        count++;

//Systemudviklings spørgsmål:-----------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er normalisering i databasedesign? og hvad er formålet med dette?",
                """
                        Normalisering i databasedesign er processen, hvor man organiserer data i en database for at reducere redundans og undgå inkonsistens i dataene. Dette gøres ved at opdele data i mindre tabeller og definere relationer mellem dem.
                        
                        Formålet er at forbedre dataintegriteten, gøre databasen mere effektiv og sikre, at data kun optræder én gang i systemet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad definerer de første tre normalformer (1NF, 2NF og 3NF)?",
                """
                        1NF (Første normalform): En tabel er i 1NF, hvis alle kolonner indeholder atomære (ufordelte) værdier, og hver række er unik.
                        
                        2NF (Anden normalform): En tabel er i 2NF, hvis den er i 1NF og alle ikke-prime attributter er fuldt afhængige af hele primærnøglen (ikke kun en del af den, hvis primærnøglen består af flere kolonner).
                        
                        3NF (Tredje normalform): En tabel er i 3NF, hvis den er i 2NF og ingen ikke-prime attributter er transitivt afhængige af primærnøglen (dvs. de er ikke afhængige af andre ikke-prime attributter).
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvordan kan normalisering hjælpe med at reducere redundans og øge dataintegritet?",
                """
                        Normalisering hjælper med at reducere redundans ved at opdele data i mindre tabeller og fjerne gentagne informationer. Dette sikrer, at hver enhed kun optræder én gang i systemet. Samtidig øger det dataintegriteten ved at minimere risikoen for inkonsistente opdateringer, da data kun skal opdateres ét sted.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen på en Primary key, en Candidate key og en Foreign key?",
                """
                        Primary key: En unik identifikator for hver række i en tabel. Der kan kun være én primær nøgle per tabel.
                        
                        En foreign key er en kolonne (eller et sæt af kolonner), der bruges til at etablere en relation mellem to tabeller, og den kan referere til hvilken som helst unik nøgle (primær eller kandidatnøgle (Ofte primær nøgle)) i den relaterede tabel.
                        
                        Foreign key: En kolonne, der refererer til primærnøglen i en anden tabel, og bruges til at etablere relationer mellem tabeller.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et ER-diagram? Og hvad er formålet med dette?",
                """
                        Et ER-diagram (Entity-Relationship-diagram) er en visuel repræsentation af data og deres relationer i en database. Det viser entiteter (tabeller), deres attributter (kolonner) og relationer mellem dem.
                        
                        Formålet er at planlægge og designe en databases struktur på en klar og organiseret måde, hvilket hjælper med at forstå data og deres sammenhænge inden implementering.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et klassediagram, og hvad er dets formål?",
                """
                Et klassediagram er en type diagram i UML (Unified Modeling Language), der bruges til at modellere strukturen af et system.
                Det viser klasser, deres attributter, metoder og relationer (som arv, association og afhængigheder) mellem klasserne.
        
                Formålet med et klassediagram er at visualisere systemets arkitektur og struktur. Det hjælper med at forstå og designe,
                hvordan forskellige objekter i systemet interagerer, hvilket gør det nemmere at planlægge, udvikle og vedligeholde koden.
                """
        ));
        count++;


//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad repræsenterer en association (lige linje) i et klassediagram?",
                """
                        En associationslinje i et klassediagram repræsenterer en relation eller forbindelse mellem to klasser. Den angiver, hvordan objekter fra de to klasser er relateret til hinanden.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad symboliserer en kompositionsforbindelse (sort diamant) i et klassediagram?",
                """
                        En kompositionsforbindelse (sort diamant) i et klassediagram symboliserer en stærk "del-af" relation, hvor den indeholdende klasse ejer og kontrollerer livscyklussen for de objekter, den er forbundet til. Hvis den indeholdende klasse slettes, slettes de relaterede objekter også.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad symboliserer en aggregeringsforbindelse (hvid diamant) i et klassediagram?",
                """
                        En aggregeringsforbindelse (hvid diamant) i et klassediagram symboliserer en svagere "del-af" relation, hvor den indeholdende klasse kan have objekter af en anden klasse, men objekterne kan eksistere uafhængigt af den indeholdende klasse. Sletning af den indeholdende klasse sletter ikke nødvendigvis de relaterede objekter.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad betyder en afhængighedsforbindelse (stiplede pil) i et klassediagram?",
                """
                        En afhængighedsforbindelse (stiplede pil) i et klassediagram betyder, at en klasse afhænger af en anden klasse for at fungere. Det betyder, at ændringer i den afhængige klasse kan påvirke den klasse, der er afhængig af den.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad betyder en generaliseringsforbindelse (Hvid pil) i et klassediagram?",
                """
                        En generaliseringsforbindelse (Hvid pil) i et klassediagram betyder, at en klasse arver egenskaber og adfærd fra en overordnet klasse. Den overordnede klasse kaldes en superklasse, og den underordnede klasse kaldes en subklasse, der kan udvide eller ændre funktionaliteten fra superklassen.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et sekvensdiagram (SD)? Og hvad er formålet med det?",
                """
                        Et sekvensdiagram er et diagram, der viser interaktionen mellem enheder (f.eks. objekter, aktører eller systemkomponenter) over tid, og det beskriver rækkefølgen af beskeder, der sendes for at udføre en funktion. Sekvensdiagrammer er tæt på koden, da de illustrerer, hvordan funktioner og metoder kaldes mellem forskellige komponenter i systemet, hvilket gør det lettere at forstå og implementere den faktiske logik i koden.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et system sekvens diagram (SSD)? Og hvad er formålet med det?",
                """
                        Et system sekvensdiagram (SSD) viser interaktionen mellem aktører og systemet, hvor beskeder sendes til systemet for at udføre en funktion. Formålet er at beskrive systemets respons på eksterne input og handlingerne, der udføres i systemet. SSD viser ikke kode direkte, men illustrerer i stedet systemets funktionelle flow og beskedudveksling på et højere abstraktionsniveau.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad adskiller et SSD fra et SD?",
                """
                        Et SSD (System Sekvens Diagram) viser interaktionen mellem aktører og systemet, mens et SD (Sekvensdiagram) viser interaktionen mellem objekter eller komponenter inden for systemet. SSD fokuserer på systemets eksterne grænse, mens SD beskriver intern kommunikation og rækkefølge af beskeder mellem objekter.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med en use case, og hvordan adskiller det sig fra andre metoder til kravspecificering?",
                """
                        Formålet med en use case er at beskrive, hvordan en bruger (eller aktør) interagerer med systemet for at opnå et specifikt mål. Det adskiller sig fra andre metoder til kravspecificering ved at fokusere på brugerens perspektiv og de funktionelle krav, der opfyldes gennem systemets handlinger, i stedet for at fokusere på tekniske detaljer eller systemets indre struktur.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad består en use case af, og hvilke elementer er vigtige at inkludere?",
                """
                        En use case består af en beskrivelse af, hvordan en aktør interagerer med et system for at opnå et mål. Vigtige elementer at inkludere er:
                        
                        Navn: Kort beskrivelse af målet.
                        Aktør(er): De personer eller systemer, der interagerer med systemet.
                        Forudsætninger: Betingelser før use casen kan udføres.
                        Hovedforløb: De trin, der beskriver interaktionen.
                        Alternativforløb: Mulige afvigelser fra hovedforløbet.
                        Postbetingelser: Hvad der er opnået, når use casen er afsluttet.
                        Undtagelser: Fejl eller uventede situationer og deres håndtering.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en user story? Og hvad er formålet den?",
                """
                        En user story er en kort, enkel beskrivelse af en funktionalitet set fra en brugers perspektiv. Den beskriver, hvad en bruger ønsker at opnå, og hvorfor det er vigtigt.
                        Den er ofte skrevet på følgende måde:
                        
                        Som en [type bruger], vil jeg [ønske/handling], så jeg kan [forventet resultat/fordel].
                        
                        Formålet med en user story er at definere krav på en måde, der fokuserer på brugerens behov og forretningsværdi. Den hjælper med at skabe en forståelse for, hvad der skal udvikles, og fungerer som grundlag for planlægning og prioritering i agile udviklingsmetoder som Scrum.
                        
                        Eksempel: Som en bruger, vil jeg kunne logge ind med min e-mail og adgangskode, så jeg kan få adgang til min konto og bruge systemets funktioner.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er strukturen af en god user story, og hvordan sikrer man, at den er effektiv?",
                """
                        Som en [type bruger], vil jeg [ønske/handling], så jeg kan [forventet resultat/fordel].
                        
                        For at sikre, at en user story er effektiv, bør den være:
                        
                        Kort og præcis: Beskriv kun det, der er nødvendigt for at forstå behovet.
                        Forståelig: Klart defineret, så alle interessenter forstår, hvad der ønskes.
                        Værdi-fokuseret: Fokus på den værdi, brugeren opnår.
                        Testbar: Skal kunne afprøves gennem acceptkriterier.
                        Delt op i mindre stories (hvis nødvendigt): Store stories opdeles i mindre, håndterbare enheder.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvordan adskiller user stories sig fra use cases, og hvornår bruger man det ene frem for det andet?",
                """
                        User stories er kortere, mere enkle beskrivelser af funktionalitet set fra brugerens perspektiv, og de fokuserer på forretningsværdi. De bruges typisk i agile udviklingsmetoder som Scrum.
                        
                        Use cases er mere detaljerede og beskriver, hvordan aktører interagerer med systemet for at opnå et mål, inklusiv hovedforløb, alternativforløb og undtagelser.
                        
                        Man bruger user stories, når man ønsker en simpel og brugervenlig beskrivelse af funktionalitet, og use cases, når man har brug for en mere detaljeret, teknisk beskrivelse af interaktionen og systemets adfærd.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med GRASP-principperne, og hvordan understøtter de objektorienteret design?",
                """
                        Der er 9 principper i GRASP, de er:
                        Information Expert, Creator, Controller, Low Coupling, High Cohesion, Polymorphism, Pure Fabrication, Indirection, Protected Variations.
                        
                        Formålet med GRASP-principperne (General Responsibility Assignment Software Patterns) er at hjælpe med at tildele ansvar til klasser og objekter på en måde, der understøtter objektorienteret design og skaber en god struktur i systemet. De hjælper med at skabe fleksible, genanvendelige og vedligeholdelsesvenlige designs.
                        
                        GRASP-principperne understøtter objektorienteret design ved at give vejledning i, hvordan ansvar skal fordeles mellem objekter, hvilket sikrer, at systemet er let at forstå, udvide og ændre.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med Creator-mønsteret i GRASP og hvornår skal det bruges?",
                """
                        Formålet med Creator-mønsteret i GRASP er at tildele ansvaret for at oprette objekter til den klasse, der har et tæt forhold til objektet, f.eks. ejer det, bruger det eller har ansvaret for det. Det skal bruges, når en klasse skal skabe objekter, og det er mest logisk, at den klasse, der bruger objektet, også skaber det, hvilket fremmer lav kobling og bedre ansvarstildeling.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med information expert?",
                """
                        Formålet med Information Expert er at tildele ansvaret for en opgave til den klasse, der har den nødvendige information til at udføre opgaven. Dette sikrer høj samhørighed og lav kobling i designet.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med Controller-mønsteret?",
                """
                        Formålet med Controller-mønsteret er at håndtere brugerinteraktioner ved at tildele ansvaret for systemoperationer til en specifik controller-klasse. Det sikrer en klar opdeling mellem brugergrænsefladen og den underliggende logik.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med Low coupling / High cohesion?",
                """
                        Formålet med Low Coupling er at minimere afhængigheder mellem klasser for at gøre systemet mere fleksibelt og robust over for ændringer.
                        Formålet med High Cohesion er at sikre, at hver klasse har et veldefineret ansvar, hvilket gør systemet lettere at forstå, vedligeholde og udvide.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med Polymorphism-mønsteret?",
                """
                        Formålet med Polymorphism-mønsteret er at lade forskellige objekter udføre samme operation på deres egen måde ved at uddelegere ansvaret til klasser, der implementerer et fælles interface eller nedarver fra samme superklasse. Det gør systemet fleksibelt og nemt at udvide.
                        
                        Eksempel: Et fælles interface Betaling med metoden betal() implementeres af klasser som Kreditkort, MobilePay og Kontanter, der hver udfører betalingen på deres egen måde.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med Pure Fabrication?",
                """
                        Formålet med Pure Fabrication er at oprette en klasse, der ikke repræsenterer et naturligt objekt i systemet, men som hjælper med at løse tekniske problemer og forbedre designet ved at holde systemet organiseret, samtidig med at man opretholder lav kobling og høj kohæsion.
                        
                        Eksempel: Forestil dig en applikation, der håndterer brugere. I stedet for at give User-klassen ansvar for at sende e-mails, kan du oprette en EmailService-klasse. EmailService repræsenterer ikke et konkret objekt i applikationen, men hjælper med at håndtere tekniske opgaver som at sende e-mails. Dette holder User-klassen ren og fokuseret på sin opgave, mens EmailService tager sig af den tekniske detalje.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er MVC arkitektur? Og hvordan bruges det i et Spring boot projekt?",
                """
                        MVC (Model-View-Controller) er en arkitektur, der opdeler applikationen i tre dele. Model repræsenterer data og forretningslogik, mens View håndterer brugergrænsefladen og præsentationen. Controller modtager brugerinput, opdaterer modellen og returnerer den passende visning.
                        
                        I et Spring Boot-projekt bruges MVC til at strukturere applikationen. Model består af Java-klasser (entities) og service-lag, der håndterer forretningslogik. Repository-laget er ansvarligt for at interagere med databasen og udføre CRUD-operationer (Create, Read, Update, Delete). View er HTML-sider eller Thymeleaf-templates, der præsentere data for brugeren. Controller er Java-klasser, der håndterer HTTP-anmodninger, interagerer med modellen og repository-laget, og returnerer de passende visninger.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen mellem UI og GUI?",
                """
                        UI (User Interface) refererer generelt til grænsefladen, som brugeren interagerer med, uanset om det er grafisk eller tekstbaseret. GUI (Graphical User Interface) er en type UI, der bruger grafiske elementer som ikoner, knapper og billeder til at interagere med brugeren. Kort sagt er GUI en specifik form for UI.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med prototyping?",
                """
                        Formålet med prototyping er at skabe en tidlig version af et system eller produkt for at visualisere ideer, teste funktionalitet og indsamle feedback fra brugere og interessenter. Det hjælper med at afklare krav, opdage problemer tidligt og forbedre designet, inden den endelige version udvikles. Prototyping gør det lettere at iterere og justere baseret på feedback.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvilke Golden Rules findes der? og hvad er formålet med disse?",
                """
                        The Golden Rules for design er:
                        
                        Place Users in Control: Giv brugeren kontrol over systemet, så de kan navigere og interagere på deres egen måde uden at føle sig begrænsede.
                        Reduce Users’ Memory Load: Minimér behovet for, at brugeren skal huske informationer. Brug af genveje, hints og logisk opbygning gør systemet lettere at bruge.
                        Make the Interface Consistent: Hold brugergrænsefladen konsekvent, så brugerne hurtigt kan lære og genkende funktioner og handlinger på tværs af systemet.
                        Formålet med disse regler er at gøre brugeroplevelsen mere intuitiv, effektiv og mindre frustrerende, hvilket øger brugervenligheden.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvilke Gestalt-love findes der? og hvad er formålet med disse?",
                """
                        Gestalt-lovene for design er:
                        
                        Figure-ground: Vi opfatter objekter som separate fra baggrunden, hvilket gør det nemmere at fokusere på det vigtigste.
                        Similarity: Lignende elementer opfattes som en gruppe, hvilket hjælper med at organisere information visuelt.
                        Proximity: Elementer, der er tættere på hinanden, opfattes som relaterede, hvilket gør det lettere at forstå sammenhængen.
                        Common region: Elementer, der er inden for samme område eller ramme, opfattes som en enhed.
                        Continuity: Vi ser linjer og mønstre som kontinuerlige, selv når de er brudte, hvilket giver en følelse af flow.
                        Closure: Vi fylder automatisk ufuldstændige former ud og ser dem som komplette, hvilket skaber en følelse af helhed.
                        Formålet med disse love er at forstå, hvordan mennesker naturligt organiserer visuel information, hvilket kan bruges til at skabe mere effektive og intuitive design.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen mellem Blackbox, Whitebox og Greybox testmetoder?",
                """
                        Blackbox testing fokuserer på at teste funktionaliteten uden at kende den interne struktur af systemet. Testeren kender ikke koden og tester kun input og output.
                        
                        Whitebox testing kræver kendskab til den interne struktur og kode af systemet. Testeren tester logik og funktioner i systemet ved at analysere koden.
                        
                        Greybox testing er en kombination af begge, hvor testeren har begrænset kendskab til den interne struktur og tester systemet både som en ekstern bruger og med indsigt i visse interne aspekter.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvilke fordele er der ved henholdsvist Blackbox- og Whitebox test?",
                """
                        Fordele ved Blackbox-test: Testeren er ikke afhængig af intern viden om systemet, hvilket giver mulighed for at finde fejl i funktionaliteten set fra en brugers perspektiv. Det er effektivt til at teste systemets brugergrænseflade og eksterne funktioner.
                        
                        Fordele ved Whitebox-test: Testeren har adgang til koden og kan dermed teste intern logik, strukturer og sikre, at alle kodelinjer fungerer som forventet. Det hjælper med at finde fejl i systemets implementering og optimering af kode.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Intergration test? og hvad er formålet med dette?",
                """
                        En integrationstest tester, hvordan forskellige dele af et system arbejder sammen. Det kan være to moduler, der er lavet i forskellige programmeringssprog eller to systemer, der skal kommunikere med hinanden. Formålet er at sikre, at data flyder korrekt mellem disse dele, og at de fungerer som forventet sammen.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                        SU,
                        2,
                        "Hvad er en Acceptance test? og hvad er formålet med dette?",
                        """
                                En acceptance test er en test, der bruges til at kontrollere, om et system eller en funktion opfylder de krav, der er sat af kunden eller slutbrugeren. Formålet med testen er at sikre, at systemet fungerer som forventet i en realistisk situation og er klar til at blive taget i brug. Et eksempel kunne være at teste, om en bruger kan oprette en konto, logge ind og gennemføre et køb på en e-handelsplatform, for at sikre at alle funktioner fungerer korrekt.
                                """)
                //Kan evt. indeholde et billede også
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en System test? og hvad er formålet med dette?",
                """
                        En systemtest er en omfattende test, hvor hele systemet testes som én samlet enhed for at sikre, at alle komponenter fungerer korrekt sammen. Formålet er at kontrollere, at systemet opfylder både funktionelle og ikke-funktionelle krav, såsom ydeevne og sikkerhed. Systemtesten er ofte stor og lang, da den tester alle funktioner, workflows og integrationer for at sikre, at alt fungerer som forventet i et produktionsmiljø.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Positiv og Negativ testning? Og hvad er formålet med disse?",
                """
                        Positiv testning fokuserer på at teste systemet med gyldige input for at sikre, at det fungerer som forventet under normale forhold. Formålet er at bekræfte, at systemet håndterer de forventede input korrekt.
                        
                        Negativ testning tester systemet med ugyldige eller uventede input for at sikre, at det håndterer fejl korrekt og ikke crasher. Formålet er at identificere fejl eller svagheder, der kan opstå ved unormale betingelser.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er FTR (Formal Technical Review)? Og hvad er formålet med dette?",
                """
                        FTR (Formal Technical Review) er en formaliseret proces, hvor et team af eksperter gennemgår et teknisk produkt (som kode, design eller dokumentation) for at identificere fejl, mangler og forbedringsmuligheder. Gennemgangen er struktureret, og deltagerne følger en fastlagt proces for at sikre, at alle relevante aspekter bliver gennemgået. Formålet er at finde problemer tidligt i udviklingsforløbet, hvilket gør det lettere og billigere at rette fejl, samt at sikre, at produktet lever op til de ønskede standarder og krav.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Mock objekter? og hvad er formålet med disse?",
                """
                        Mock objekter er simulerede versioner af de rigtige objekter, som bruges i unit tests for at erstatte eksterne afhængigheder, som f.eks. databaser eller eksterne API'er. Formålet med mock objekter er at isolere den del af systemet, der testes, så man kun tester den specifikke funktionalitet, uden at det påvirkes af eksterne systemer eller ressourcer. Det hjælper med at sikre, at testen er præcis og fokuseret på den kode, der skal evalueres.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Stub objekter/metode? og hvad er formålet med disse?",
                """
                        Stub objekter/metode er en forenklet version af en metode, der bruges i tests til at simulere afhængigheder, som kan være for komplekse eller ikke implementeret endnu. Stubben returnerer et forudbestemt resultat, så man kan teste den oprindelige metode isoleret fra den komplekse funktionalitet, den normalt kalder. Formålet er at gøre det muligt at teste en metode uden at blive påvirket af eksterne, komplekse komponenter.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen på formel og uformel review?",
                """
                        Formel review er en struktureret gennemgang, der følger en fast proces og ofte inkluderer dokumentation, møder og specifikke roller for deltagerne. Formålet er at identificere fejl og sikre kvalitet.
                        
                        Uformel review er en mere afslappet, ustruktureret gennemgang, hvor deltagerne hurtigt gennemgår arbejdet uden en formaliseret proces. Det er ofte mindre tidkrævende og mere uformelt.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et State machine diagram? og hvad er formålet med dette?",
                """
                        
                        Et State machine diagram er et diagram, der viser de forskellige tilstande, et system eller objekt kan være i, og hvordan det skifter mellem disse tilstande baseret på hændelser. Formålet er at modellere systemets opførsel og vise, hvordan det reagerer på forskellige begivenheder i forskellige tilstande.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en domænemodel? Og hvad er formålet med den?",
                """
                        En domænemodel viser domænet – altså de vigtigste begreber og deres relationer i den virkelige verden, som systemet skal understøtte. Den fokuserer på, hvad systemet skal håndtere, men ikke hvordan systemet er bygget indeni.
                        
                        Den viser typisk ting som brugere, produkter, ordrer osv., men ikke tekniske detaljer som databaser eller kode.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er et aktivitetsdiagram, og hvad bruges det til?",
                """
                        Et aktivitetsdiagram viser, hvordan en proces eller arbejdsgang forløber, step for step. Det bruges til at visualisere, hvordan aktiviteterne hænger sammen og hvilken rækkefølge de udføres i.
                        
                        Det bruges til at forstå og kommunikere, hvordan en opgave eller proces skal udføres i systemet.
                        Læs uddybet: https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-activity-diagram/
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen mellem vandfaldsmodellen og iterativ udvikling?",
                """
                        Vandfaldsmodellen er en lineær proces, hvor man gennemfører et skridt ad gangen, og hvert skridt skal være færdigt, før man går videre.
                        
                        Iterativ udvikling arbejder i små dele, hvor man kan lave ændringer og forbedringer efterhånden som arbejdet skrider frem.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en backlog i Scrum, og hvordan administreres den?",
                """
                        En backlog i Scrum er en prioriteret liste over opgaver, funktioner og krav, der skal udvikles i et projekt.
                        
                        Den administreres ved, at Product Owner løbende opdaterer og prioriterer opgaverne baseret på forretningsværdi og behov. Under Sprint Planning udvælges de vigtigste opgaver til det kommende sprint, hvorefter teamet arbejder på dem.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Product Owner, og hvad er deres rolle i Scrum?",
                """
                        En Product Owner i Scrum er ansvarlig for at maksimere værdien af produktet og sikre, at udviklingsteamet arbejder på de rigtige opgaver.
                        
                        Deres rolle inkluderer at definere og prioritere Product Backlog, kommunikere med interessenter og sikre, at teamet forstår kravene og målene.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en sprint retrospective, og hvorfor er den vigtig?",
                """
                        En Sprint Retrospective er et møde efter et sprint, hvor teamet evaluerer, hvad der gik godt, hvad der kan forbedres, og hvilke tiltag der skal implementeres.
                        
                        Den er vigtig, fordi den fremmer løbende forbedringer, øger samarbejdet og optimerer arbejdsprocesserne i Scrum-teamet.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en burn-down chart, og hvordan bruges den i agile udvikling?",
                """
                        En Burn-Down Chart er en graf, der viser det resterende arbejde i et sprint eller projekt over tid.
                        
                        Den bruges i agil udvikling til at visualisere fremskridt, vurdere velocity (teamets gennemførelseshastighed) og sammenligne med capacity (tilgængelige ressourcer). Data fra burn-down chartet hjælper med at tilpasse planning points i fremtidige sprints for bedre estimering og planlægning.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en MVP (Minimum Viable Product), og hvordan bruges den i agil udvikling?",
                """
                        En MVP (Minimum Viable Product) er den simpleste version af et produkt med nok funktionalitet til at skabe værdi og teste markedet.
                        
                        Den bruges i agil udvikling til hurtigt at indsamle feedback, validere idéer og iterere produktet baseret på reelle brugerbehov, før der investeres i fuld udvikling.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvordan adskiller integrationstests sig fra unit tests?",
                """
                        Integrationstests tester, hvordan forskellige komponenter eller systemer arbejder sammen, mens unit tests tester individuelle enheder af kode isoleret.
                        
                        Integrationstests sikrer, at moduler fungerer korrekt sammen, mens unit tests fokuserer på små dele af koden for at fange fejl tidligt.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Scrum, og hvad er formålet med det?",
                """
                        Scrum er en agil udviklingsmetode, der fokuserer på iterative processer, selvorganiserende teams og kontinuerlig forbedring. Den involverer elementerne: Product Backlog, sprint backlog.\s
                        Møderne: Sprint Planning, Daily Stand-ups, Sprint Review, Sprint Retrospective.
                        Rollerne: Scrum Master, Product Owner, og Development Team.
                        
                        Formålet er at levere værdi hurtigt, øge fleksibilitet og forbedre samarbejde gennem korte udviklingscyklusser kaldet sprints.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Sprint, og hvor længe kan et sprint varer?",
                """
                        En Sprint er en kort, tidsafgrænset udviklingscyklus i Scrum, hvor et team arbejder på at levere et færdigt, potentielt leverbart produkt.
                        
                        Et sprint varer typisk 2-4 uger, men længden kan tilpasses afhængigt af projektets behov.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Sprint Backlog, og hvordan adskiller den sig fra en Product Backlog?",
                """
                        En Sprint Backlog er en liste over opgaver og funktioner, som teamet skal arbejde på i løbet af et sprint, baseret på de højeste prioriterede elementer fra Product Backlog.
                        
                        Forskellen er, at Product Backlog indeholder alle opgaver for produktet, mens Sprint Backlog kun indeholder de opgaver, der er valgt til det aktuelle sprint.
                        
                        Der må ikke ændres på sprint backlog items, kun product backlog items.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvilke roller findes der i Scrum, og hvad er deres ansvarsområder?",
                """
                        Product Owner: Ansvarlig for at definere og prioritere Product Backlog og sikre, at teamet arbejder på de vigtigste opgaver for at maksimere produktets værdi.
                        Scrum Master: Ansvarlig for at støtte teamet, fjerne forhindringer og sikre, at Scrum-processen følges korrekt.
                        Development Team: Ansvarlig for at udvikle og levere produktet, selvorganisere sig og samarbejde om at nå sprintmålene.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen mellem en Scrum Master og en Product Owner?",
                """
                        Scrum Master er ansvarlig for at sikre, at Scrum-processen følges, fjerne forhindringer for teamet og støtte teamet i at forbedre deres arbejdsmetoder.
                        Product Owner er ansvarlig for at definere og prioritere Product Backlog, kommunikere med interessenter og sikre, at teamet arbejder på de opgaver, der skaber mest værdi.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Scrum Masters vigtigste ansvar?",
                """
                        Scrum Masters vigtigste ansvar er at sikre, at Scrum-processen følges korrekt, støtte teamet i at arbejde effektivt, fjerne forhindringer, og facilitere Scrum-møder som Sprint Planning, Daily Stand-ups, Sprint Review og Sprint Retrospective.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Sprint Planning, og hvad er dens formål?",
                """
                        Sprint Planning er et møde, hvor teamet planlægger, hvad der skal arbejdes på i det kommende sprint.
                        
                        Formålet er at definere sprintmålene, vælge de opgaver fra Product Backlog, der skal arbejdes på, og planlægge, hvordan teamet skal nå målene inden for sprintens tidsramme.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Daily Scrum, og hvad er de tre primære spørgsmål, der besvares under mødet?",
                """
                        Daily Scrum er et kort, dagligt møde, hvor teamet koordinerer og opdaterer hinanden om fremdrift.
                        
                        De tre primære spørgsmål, der besvares under mødet, er:
                        
                        Hvad har jeg gjort siden sidst?
                        Hvad vil jeg arbejde på i dag?
                        Er der nogen hindringer, der forhindrer mig i at nå mit mål?
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er en Sprint Review, og hvad sker der under dette møde?",
                """
                        Sprint Review er et møde, hvor teamet præsenterer det færdige arbejde fra sprintet for interessenter og får feedback.
                        
                        Under mødet gennemgår teamet, hvad der blev opnået i sprintet, diskuterer eventuelle ændringer eller forbedringer og tilpasser Product Backlog baseret på feedbacken.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad gør man hvis teamet er færdig med alle sprint backlog items en dag før sprintet er slut?",
                """
                        Hvis teamet er færdigt med alle Sprint Backlog-elementer en dag før sprintet er slut, bør de reflektere over, hvorfor sprintet blev fejlestimeret. Denne ekstra tid kan bruges til at analysere og lære af estimaterne, så teamet kan forbedre deres evne til at estimere arbejdet i fremtidige sprints og dermed opnå mere præcise planer og bedre forudsigelser.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Definition of Done (DoD), og hvorfor er det vigtigt?",
                """
                        Definition of Done (DoD) er en klar og fælles forståelse i teamet af, hvornår en opgave eller funktion er fuldstændig færdig og klar til at blive betragtet som afsluttet.
                        
                        DoD er vigtigt, fordi det sikrer, at der ikke er nogen tvivl om kvaliteten af arbejdet, og at alle opgaver opfylder de nødvendige krav, før de betragtes som færdige og leveres.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvordan estimerer man opgaver i Scrum?",
                """
                        I Scrum estimeres opgaver ofte ved hjælp af Story Points, som er en relativ måling af opgavens kompleksitet, størrelse og arbejdsindsats.
                        
                        Teamet diskuterer og vurderer opgaverne sammen, og hver opgave tildeles en pointværdi baseret på tidligere erfaringer og teamets fælles vurdering. Det kan også bruges Planning Poker som metode til at nå frem til konsensus om estimaterne. Selvom User Stories og Story Points ofte bruges i Scrum, er de ikke en del af den officielle Scrum-ramme.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er Capacity & Velocity i Scrum, og hvordan beregnes volocity?",
                """
                        Capacity i Scrum refererer til den mængde arbejde, et team kan påtage sig i et sprint baseret på tilgængelige ressourcer og arbejdstid.
                        
                        Velocity er den gennemsnitlige mængde arbejde, et team kan færdiggøre pr. sprint, og beregnes ved at summere de Story Points, som teamet har afsluttet i et sprint. Denne værdi bruges til at hjælpe med at estimere, hvor meget arbejde teamet realistisk kan håndtere i fremtidige sprints.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Må sprint backlog items ændres under et sprint? Forklar",
                """
                        Sprint Backlog-items bør ikke ændres under et sprint, da det kan forstyrre sprintets mål og fokus. Ændringer i Sprint Backlog bør kun finde sted i yderste tilfælde, når det er absolut nødvendigt, og kun efter en grundig diskussion og godkendelse fra både Scrum Master og Product Owner.
                        
                        Når et sprint er startet, er det vigtigt, at teamet arbejder på de opgaver, der er blevet defineret i sprintplanlægningen, for at sikre stabilitet og undgå at afvige fra den oprindelige plan.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Må product backlog items ændres under et sprint? Forklar",
                """
                        Ja, Product Backlog-items kan ændres under et sprint, da Product Backlog er et dynamisk dokument, der kan opdateres løbende baseret på feedback, ændrede prioriteter eller nye oplysninger.
                        
                        Dog bør ændringerne i Product Backlog ikke påvirke det nuværende sprint, da det kan forstyrre teamets fokus. Product Owner er ansvarlig for at opdatere Product Backlog og sikre, at de nye eller ændrede items prioriteres korrekt for fremtidige sprints.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad gør Scrum emperisk?",
                """
                        Scrum er empirisk, fordi det bygger på erfaring, observation og kontinuerlig læring. I stedet for at forudsige alle løsninger på forhånd, fokuserer Scrum på at lære fra konkrete erfaringer og justere kursen baseret på den viden, der opnås gennem Sprint Reviews, Retrospectives, og den løbende feedback fra teamet og interessenter.
                        
                        Denne empiriske tilgang gør det muligt for teamet at tilpasse sig ændringer og forbedre arbejdsmetoder i realtid.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad er forskellen mellem en relationel og en ikke-relationel database?",
                """
                        Forskellen mellem en relationel og en ikke-relationel database ligger i, hvordan data organiseres og lagres:
                        
                        Relationel database organiserer data i tabeller, der er forbundet via relationer (f.eks. ved hjælp af primære og fremmede nøgler). Den bruger strukturerede forespørgsler som SQL til at manipulere data.
                        
                        Ikke-relationel database (NoSQL) lagrer data i mere fleksible formater som dokumenter, nøgleværdi-par eller grafer, og den er ikke afhængig af tabeller eller relationer. Den er ofte mere skalerbar og kan håndtere ustrukturerede data.
                        
                        Relationelle databaser er bedst til struktureret data med faste relationer, mens ikke-relationelle databaser er velegnede til ustruktureret eller hurtigt skiftende data.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                SU,
                2,
                "Hvad betyder det at normalisere en database?",
                """
                        At normalisere en database betyder at organisere data i tabeller på en måde, der reducerer redundans og afhængigheder for at sikre dataintegritet. Dette gøres ved at opdele store tabeller i mindre, mere fokuserede tabeller og oprette relationer mellem dem.
                        
                        Normalisering hjælper med at undgå datadubletter og sikrer, at opdateringer, indsættelser og sletninger af data kan udføres uden at skabe inkonsistens. Processen omfatter ofte flere "normalformer" (1NF, 2NF, 3NF), der specificerer de krav, data skal opfylde for at være korrekt normaliseret.
                        """)
        );
        count++;


//Teknologi-----------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er den relationelle datamodel?",
                """
                        Den relationelle datamodel er en måde at organisere data i tabeller (relationer), hvor hver tabel består af rækker (poster) og kolonner (attributter). Data i forskellige tabeller kan være forbundet ved hjælp af nøgler, som f.eks. primærnøgler og fremmednøgler. Modellen bruges i relationelle databaser som MySQL.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er en database tabel? Og hvad er en database kolonne?",
                """
                        En database tabel er en struktur i en database, der organiserer data i rækker og kolonner. Hver tabel repræsenterer en samling af relaterede data, som f.eks. kunder, ordrer eller produkter.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er ’JOIN’ i SQL? (LEFT, RIGHT, INNER & FULL)",
                """
                        JOIN i SQL bruges til at kombinere data fra flere tabeller baseret på en fælles kolonne.
                        
                        INNER JOIN returnerer kun de rækker, hvor der er en match i begge tabeller.
                        LEFT JOIN (eller LEFT OUTER JOIN) returnerer alle rækker fra venstre tabel og de matchede rækker fra højre tabel. Hvis der ikke er noget match, returneres NULL for højre tabel.
                        RIGHT JOIN (eller RIGHT OUTER JOIN) er det modsatte af LEFT JOIN og returnerer alle rækker fra højre tabel og de matchede rækker fra venstre tabel. Hvis der ikke er noget match, returneres NULL for venstre tabel.
                        FULL JOIN (eller FULL OUTER JOIN) returnerer alle rækker fra både venstre og højre tabel. Hvis der ikke er et match, vil der blive returneret NULL for de ikke-matchede kolonner i den tabel.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er Git?",
                """
                        Git er et versionsstyringssystem, der bruges til at spore ændringer i filer og samarbejde om projekter. Det gør det muligt for flere udviklere at arbejde på samme kodebase samtidig, gemme versioner af koden og nemt rulle ændringer tilbage, hvis det er nødvendigt. Git er decentraliseret, hvilket betyder, at hver udvikler har en lokal kopi af hele projektet.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er GitHub?",
                """
                        GitHub er en webbaseret platform, der hoster Git-repositories og muliggør samarbejde om softwareudviklingsprojekter. Den tilbyder funktioner som versionkontrol, pull requests, issues og code review, og gør det nemt for udviklere at dele og arbejde på kode sammen online. Git og GitHub er ikke det samme; Git er et versionsstyringssystem, mens GitHub er en platform, der bruger Git til at administrere kode online.
                        """)
        );
        count++;

        //--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er DDL (Data Definition Language?)",
                """
                        DDL (Data Definition Language) er en del af SQL, der bruges til at definere og ændre strukturen af databaser og tabeller. DDL-kommandoer omfatter CREATE, ALTER, DROP, og TRUNCATE, som bruges til at oprette, ændre, slette eller rydde tabeller og andre databaseobjekter.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er DML (Data Manipulation Language)?",
                """
                        DML (Data Manipulation Language) er en del af SQL, der bruges til at manipulere data i en database. DML-kommandoer omfatter SELECT, INSERT, UPDATE, og DELETE, som bruges til at hente, indsætte, opdatere eller slette data i tabeller.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er Aggregation functions? Og hvad er formålet med disse?",
                """
                        Disse funktioner anvendes til at opsummere data på en gruppebasis. De beregner en værdi ud fra flere rækker i en tabel.
                        
                        Eksempler på aggregation functions inkluderer SUM(), AVG(), COUNT(), MAX(), og MIN().
                        
                        Formål: Bruges til at beregne statistik eller opsummerede værdier, f.eks. summen af alle salg i en måned eller gennemsnitsalderen for en gruppe personer.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er en Subquery? Og hvad er formålet med den?",
                """
                        En subquery er en forespørgsel, der er indlejret i en anden forespørgsel. Subqueries kan bruges i SELECT, INSERT, UPDATE eller DELETE sætninger.
                        
                        Formål: Bruges til at hente resultater, der kan bruges som input til en anden forespørgsel. En subquery kan returnere én værdi (skal være en enkel værdi) eller flere rækker og kolonner.
                        
                        Eksempel (ekstra emne):
                        For at finde alle ansatte, der tjener mere end gennemsnittet for virksomheden, kan en subquery bruges til at beregne gennemsnitslønnen, og derefter bruge den værdi til at filtrere de relevante ansatte i hovedforespørgslen.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//


        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er en JAR fil? Og hvad er formålet med den?",
                """
                        En JAR-fil (Java ARchive) er en fil, der samler flere Java-klasser, metadata og ressourcefiler (som billeder eller tekstfiler) i én fil. Formålet med en JAR-fil er at gøre det nemmere at distribuere og køre Java-applikationer ved at pakke alle nødvendige filer i et enkelt arkiv.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er fordelene ved at pakke en applikation i en JAR-fil fremfor at distribuere enkeltstående filer? ",
                """
                        Fordelene ved at pakke en applikation i en JAR-fil fremfor at distribuere enkeltstående filer inkluderer:
                        
                        Nem distribution: Alle filer (Java-klasser, ressourcer og biblioteker) samles i én fil, hvilket gør det lettere at distribuere og opdatere applikationen.
                        Kompakt størrelse: JAR-filer kan komprimere indholdet, hvilket reducerer filstørrelsen.
                        Sikkerhed: JAR-filer kan signeres, hvilket gør det muligt at bekræfte, at indholdet ikke er blevet ændret.
                        Udførelse: En JAR-fil kan gøres eksekverbar, hvilket gør det nemt at starte applikationen med én kommando.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvordan opretter man en JAR-fil i Java? Hvilket værktøj kan man bruge til at lave en JAR-fil?",
                """
                        Man kan oprette en JAR-fil i Java ved hjælp af Maven, som automatisk bygger JAR-filer baseret på projektets konfiguration i pom.xml-filen. Maven samler projektets Java-klasser og afhængigheder og pakker dem i en JAR-fil. Gradle er et alternativ, der også kan bruges til at oprette JAR-filer, men Maven er specielt populært til denne opgave.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvordan kan man arbejde med Git og GitHub i et projekt?",
                """
                        Man kan arbejde med Git og GitHub i et projekt ved at bruge Git til at versionere koden lokalt på sin maskine og GitHub til at opbevare og dele koden online. Først initialiserer man et Git-repository i projektmappen, laver ændringer, og bruger Git-kommandoer som commit, push, og pull til at synkronisere med GitHub. GitHub giver mulighed for at samarbejde med andre, oprette pull requests, og holde styr på ændringer i koden.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er en Branch og hvordan arbejdes der med Branches?",
                """
                        En branch i Git er en separat arbejdsgren, hvor man kan lave ændringer uden at påvirke hovedprojektet (typisk kaldet main eller master). Man arbejder med branches ved at oprette en ny branch for en specifik funktion eller opgave, foretage ændringer på den, og derefter merge (sammenflette) den tilbage til hovedbranchen, når arbejdet er færdigt. Dette gør det muligt at udvikle funktioner parallelt og sikre, at kodebasen forbliver stabil.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er Merging ift. Github?",
                """
                        Merging i GitHub refererer til processen, hvor man kombinerer ændringer fra én branch med en anden. Når man arbejder på en feature branch og er færdig med arbejdet, kan man merge den tilbage til hovedbranchen (f.eks. main). Dette sikrer, at de ændringer, der er lavet i feature-branchen, bliver en del af projektets hovedkodebase. Merging kan gøres manuelt eller gennem en pull request, hvor teammedlemmer kan gennemgå ændringerne før integration.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er en Merge Konflikt og hvordan kan man løse det?",
                """
                        En merge konflikt opstår, når Git ikke automatisk kan kombinere ændringer fra to forskellige branches, fordi de ændringer, der er lavet, påvirker samme del af en fil på forskellige måder. For at løse en merge konflikt, skal man manuelt gennemgå de berørte filer og beslutte, hvilke ændringer der skal bevares. Git markerer konfliktområderne i filerne, så man kan vælge den korrekte version og derefter committe de løste filer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvilke typer Linux-distributioner understøttes på Azure? ",
                """
                        Azure understøtter flere Linux-distributioner, herunder:
                        
                        Ubuntu
                        Debian
                        Red Hat Enterprise Linux (RHEL)
                        SUSE Linux Enterprise Server (SLES)
                        Oracle Linux
                        Flatcar Container Linux
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen mellem en \"on-premises\" Linux-server og en Azure Linux virtuel machine?",
                """
                        En "on-premises" Linux-server er en fysisk server, der er placeret og administreret lokalt på en virksomheds fysiske placering (datacenter eller serverrum). Alle ressourcer som strøm, netværk og hardware vedligeholdelse er virksomhedens ansvar.
                        
                        En Azure Linux virtuel maskine (VM) er en virtuel server, der kører på Microsoft Azure's cloudinfrastruktur. Azure håndterer den fysiske hardware, netværk, strøm og skalering, og du betaler kun for de ressourcer, du bruger. Fordele ved Azure VM'er inkluderer fleksibel skalering, sikkerhed, backup og globale data centre.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvilke fordele har Azure Linux-baserede løsninger fremfor Windows-baserede i deployment?  ",
                """
                        Azure Linux-baserede løsninger tilbyder flere fordele over Windows, herunder lavere licensomkostninger, bedre fleksibilitet og tilpasning, samt nem adgang til open source-værktøjer. Linux er også ideelt til containerteknologier som Docker og Kubernetes, og det giver bedre ydeevne, skalerbarhed og sikkerhed for cloud-applikationer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvilke fordele/ulemper kan Deployment give et projekt?",
                """
                        Fordele ved deployment er, at det gør det lettere at opdatere og dele applikationen, samt at den kan skalere og tilgås af flere brugere.
                        
                        Ulemper er, at der kan opstå fejl under deployment, som kan forårsage nedetid, og det kræver tid og ressourcer at sikre, at alt fungerer korrekt.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvordan forbinder man en Azure database til et Spring boot projekt?",
                """
                        For at forbinde en Azure database til et Spring Boot-projekt, skal du følge disse trin:
                        
                        Opret en Azure SQL-database på Azure-portalen.
                        Hent forbindelses-URL til databasen fra Azure-portalen.
                        Tilføj de nødvendige afhængigheder for JDBC og den specifikke database (f.eks. MySQL) i din pom.xml (Maven).
                        Konfigurer application.properties eller application.yml med databaseforbindelsesoplysningerne, såsom URL, brugernavn og adgangskode.
                        Brug Spring Data JPA eller JdbcTemplate til at interagere med databasen.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen på en Mysql Database - localhost og på Azure?",
                """
                        Forskellen mellem en MySQL-database på localhost og en MySQL-database på Azure ligger primært i placeringen og administrationen.
                        
                        MySQL på localhost: Databasen er hostet på din egen maskine eller server, og du har fuld kontrol over installation, konfiguration og vedligeholdelse. Det kræver, at du selv styrer sikkerhed, backup og skalering.
                        
                        MySQL på Azure: Databasen er hostet på Azure's cloudinfrastruktur, og Azure håndterer administration som sikkerhed, skalering, backup og opdateringer. Det gør det lettere at administrere og skalerer automatisk baseret på behov, men du betaler for de ressourcer, du bruger.
                        
                        Azure tilbyder mere skalerbarhed og høj tilgængelighed, mens en lokal database giver mere kontrol, men kræver mere vedligeholdelse.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er miljøvariabler set i forhold til et Spring projekt?",
                """
                        I et Spring-projekt bruges miljøvariabler til at opbevare konfigurationsoplysninger, som kan tilpasses baseret på forskellige miljøer (f.eks. udvikling, test, produktion). Miljøvariabler bruges ofte til at gemme følsomme oplysninger som databasenavne, brugernavne, adgangskoder og API-nøgler, så disse ikke hardkodes i applikationen.
                        
                        I Spring kan miljøvariabler let tilgås i application.properties eller application.yml ved hjælp af syntaks som ${VAR_NAME}. Dette gør det muligt at ændre konfigurationer uden at skulle ændre koden, hvilket er praktisk, når man skifter mellem forskellige miljøer.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvorfor er det godt at bruge miljøvariabler?",
                """
                        Det er godt at bruge miljøvariabler, fordi de gør det muligt at opbevare konfigurationsdata uden at hardkode dem i koden. Det forbedrer sikkerheden (ved at skjule følsomme oplysninger), gør det lettere at skifte mellem forskellige miljøer (f.eks. udvikling, test, produktion), og forenkler vedligeholdelse, da ændringer kun kræver opdatering af variablerne, ikke koden.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen på en primær nøgle og en fremmed nøgle i en database?",
                """
                        En primær nøgle (primary key) er en unik identifikator for en række i en tabel. En fremmed nøgle (foreign key) er en kolonne (eller flere) i en tabel, der refererer til en unik nøgle i en anden tabel – ofte en primær nøgle, men det kan også være en unik nøgle (unique key).
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen mellem en INNER JOIN og en LEFT JOIN i SQL?",
                """
                        En INNER JOIN returnerer kun de rækker, hvor der er match i begge tabeller. En LEFT JOIN returnerer alle rækker fra den venstre tabel og de matchende rækker fra den højre tabel – hvis der ikke er et match, vises NULL-værdier for den højre tabel.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen mellem GROUP BY og HAVING i SQL?",
                """
                        GROUP BY grupperer rækker baseret på en eller flere kolonner for at aggregere data, mens HAVING bruges til at filtrere grupper efter en betingelse – ligesom WHERE, men for grupperede data.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad betyder det at commit ændringer i Git?",
                """
                        At committe ændringer i Git betyder at gemme en snapshot af de aktuelle filer i repositoryens historik. Et commit indeholder en beskrivelse af ændringerne og fungerer som et gendannelsespunkt. Commit ændrer dog kun det lokale repository – ændringerne skal pushes for at blive synlige i et eksternt repository.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvordan fungerer versionkontrol med Git, og hvorfor er det vigtigt i et udviklingsprojekt?",
                """
                        Versionskontrol med Git sporer ændringer i filer over tid, så udviklere kan arbejde sammen, gendanne tidligere versioner og håndtere forskellige kodestadier. Det er vigtigt i et udviklingsprojekt, fordi det sikrer samarbejde, minimerer fejl, muliggør eksperimentering uden risiko og giver en historik over ændringer.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvordan fungerer en \"pull request\" i GitHub?",
                """
                        En pull request i GitHub bruges til at foreslå og diskutere ændringer, før de flettes ind i hovedprojektet. Udvikleren opretter en pull request fra en gren, og andre kan derefter gennemgå, kommentere og eventuelt godkende ændringerne, før de bliver integreret i hovedgrenen.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er Infrastructure as a Service (IaaS) og Platform as a Service (PaaS)?",
                """
                        Infrastructure as a Service (IaaS) leverer grundlæggende IT-infrastruktur som virtuelle maskiner, netværk og lagring, hvor brugeren selv administrerer operativsystemer og applikationer.
                        
                        Platform as a Service (PaaS) tilbyder en fuldt administreret udviklingsplatform med værktøjer, databaser og hosting, så udviklere kan fokusere på kode uden at håndtere infrastruktur.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad er forskellen mellem en virtuel maskine og en container?",
                """
                        En virtuel maskine (VM) emulerer en hel computer med eget operativsystem og hardwarevirtualisering, hvilket gør den tungere og mere ressourcekrævende.
                        
                        En container deler værtsoperativsystemets kerne og kører isolerede applikationer med egne afhængigheder, hvilket gør den lettere, hurtigere og mere effektiv end en VM.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Teknologi,
                2,
                "Hvad betyder det at deploy en applikation, og hvilke steps er involveret?",
                """
                        At deploye en applikation betyder at gøre den tilgængelig for brugere ved at udrulle den til en server eller cloud-miljø.
                        
                        Typiske steps inkluderer:
                        
                        Bygning – kompiler og pak applikationen.
                        Test – verificer, at den fungerer korrekt.
                        Deployment – udrul til server eller cloud.
                        Overvågning – tjek for fejl og ydeevne.
                        Vedligeholdelse – opdater og fejlret løbende.
                        """)
        );
        count++;

//IT- og Forretningsforståelse:---------------------------------------------------------------------------------------//

        questions.add(new Question(count,
                ITF,
                2,
                "Hvad er en interessentanalyse? Og hvad er formålet med den?",
                """
                        En interessentanalyse identificerer og vurderer de personer eller grupper, der har interesse i et projekt. Formålet er at forstå deres behov, påvirkning og forventninger, så projektet kan tilpasses og risici minimeres. Typisk udarbejdes også en kommunikationsplan for at sikre effektiv dialog med interessenterne.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan identificerer og klassificerer man interessenter i en interessentanalyse?",
                """
                        I en interessentanalyse identificerer man interessenter ved at kortlægge alle personer, grupper eller organisationer, der påvirkes af eller har interesse i projektet. Dette kan omfatte både interne og eksterne parter som kunder, medarbejdere, leverandører og myndigheder.
                        
                        Når man klassificerer interessenter, opdeler man dem ofte efter deres indflydelse og interesse i projektet. En almindelig metode er at bruge en interessentmatrix, hvor interessenter kategoriseres i grupper som:
                        
                        Højt indflydelse, høj interesse
                        Højt indflydelse, lav interesse
                        Lav indflydelse, høj interesse
                        Lav indflydelse, lav interesse
                        Dette hjælper med at prioritere, hvordan man skal engagere sig med dem gennem projektet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en interessentanalyse hjælpe med at sikre projektets succes?",
                """
                        En interessentanalyse hjælper med at sikre projektets succes ved at identificere og forstå de personer eller grupper, der har interesse i projektet, og hvordan deres behov og forventninger kan påvirke det. Ved at kortlægge interessenternes indflydelse og interesse kan man tilpasse kommunikationen og involveringen af de vigtigste interessenter, hvilket reducerer risikoen for konflikter og sikrer, at projektet får den nødvendige støtte.
                        
                        Analysen gør det også lettere at prioritere ressourcer og opmærksomhed, så de mest kritiske interessenter får den rette opmærksomhed. Dette bidrager til at skabe et stærkt fundament for projektet og øger chancerne for succes.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvilke strategier kan man anvende for at engagere forskellige typer interessenter?",
                """
                        
                        For at engagere forskellige typer interessenter kan man anvende forskellige strategier baseret på deres indflydelse og interesse:
                        
                        Højt indflydelse, høj interesse: Disse interessenter skal inddrages tæt i beslutningsprocessen og holdes opdateret. Brug regelmæssig kommunikation og involver dem i nøglebeslutninger.
                        
                        Højt indflydelse, lav interesse: Sørg for at holde dem informerede, men involver dem kun i de beslutninger, hvor deres input er nødvendigt. Hold kommunikationen kort og fokuseret.
                        
                        Lav indflydelse, høj interesse: Hold dem engageret ved at dele information, som er relevant for dem, og tilbyde muligheder for feedback. Det hjælper med at opretholde deres støtte.
                        
                        Lav indflydelse, lav interesse: Disse interessenter kræver minimal opmærksomhed. Hold dem opdateret med overordnet information, men undgå at bruge unødvendige ressourcer på dem.
                        
                        Ved at tilpasse engagementet baseret på interessenternes position kan man optimere ressourcerne og sikre et positivt forhold gennem projektet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvad er en risikoanalyse? Hvad er formålet? Og hvordan prioriteres risici?",
                """
                        En risikoanalyse er en proces, hvor man identificerer, vurderer og prioriterer potentielle risici, der kan påvirke et projekt. Formålet med risikoanalysen er at forberede sig på mulige problemer, så man kan tage proaktive skridt til at reducere eller håndtere dem.
                        
                        Risici prioriteres ved at vurdere deres sandsynlighed for at opstå og den påvirkning/konsekvens, de vil have på projektet, hvis de sker. Sandsynlighed og påvirkning vurderes typisk på en skala (f.eks. 1-5), og derefter ganges de sammen for at få et produkt. Jo højere produkt, desto højere prioritet får risiciene.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan man bruge en risikoanalyse til at minimere usikkerhed i et projekt?",
                """
                        En risikoanalyse hjælper med at minimere usikkerhed i et projekt ved at identificere potentielle risici tidligt, vurdere deres sandsynlighed og konsekvenser, og derefter tage proaktive skridt for at håndtere dem. Ved at have en klar plan for, hvordan risici skal håndteres, kan man reducere uventede problemer og sikre, at projektet forløber mere forudsigeligt og kontrolleret.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvilke aspekter vurderes typisk i en feasibility-analyse, og hvordan bidrager de til beslutningstagning?",
                """
                        Teknisk feasibility: Er de nødvendige teknologier og ressourcer tilgængelige?
                        Økonomisk og finansiel feasibility: Er projektet økonomisk bæredygtigt?
                        Operationel og organisatorisk feasibility: Har organisationen kapacitet til at støtte projektet?
                        Retlig og juridisk feasibility: Overholder projektet relevante love og reguleringer?
                        Politiske og planmæssige forhold (hvis relevant): Er projektet forenligt med politiske mål og planlægningskrav?
                        Disse vurderinger hjælper beslutningstagere med at afgøre, om projektet er realistisk og værd at forfølge.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en feasibility-analyse hjælpe med at vurdere risikoen ved et projekt?",
                """
                        En feasibility-analyse hjælper med at vurdere risikoen ved et projekt ved at identificere potentielle udfordringer og usikkerheder i forhold til tekniske, økonomiske, operationelle, juridiske og politiske faktorer. Ved at analysere disse områder kan man tidligt i projektet identificere risici, som kan påvirke projektets gennemførelse og succes, og dermed tage proaktive skridt til at mitigere dem.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvad er en SWOT-analyse?",
                """
                        En SWOT-analyse er en strategisk metode, der bruges til at vurdere en organisations styrker, svagheder, muligheder og trusler. Formålet med analysen er at få et klart billede af både interne faktorer (styrker og svagheder) og eksterne faktorer (muligheder og trusler), som kan påvirke beslutningstagning og strategi. SWOT-analyse hjælper med at identificere områder, hvor organisationen kan udnytte sine styrker, forbedre svagheder, gribe muligheder og håndtere trusler.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvad er forskellen mellem interne og eksterne interessenter i en interessentanalyse?",
                """
                        Interne interessenter er personer eller grupper indenfor organisationen, som påvirkes af eller har indflydelse på projektet, som medarbejdere, ledelse og ejere.
                        
                        Eksterne interessenter er personer eller grupper udenfor organisationen, som også kan påvirkes af projektet eller have indflydelse på det, som kunder, leverandører og myndigheder.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en interessentanalyse bidrage til effektiv kommunikation i et projekt?",
                """
                        En interessentanalyse hjælper med at identificere og forstå de vigtigste interessenter, deres behov og forventninger. Dette gør det muligt at tilpasse kommunikationen til de forskellige interessenters niveau og interesser, hvilket sikrer, at alle får den rette information på det rette tidspunkt, og dermed fremmer effektiv kommunikation i projektet.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvad er forskellen på en proaktiv og en reaktiv tilgang til risikoanalyse?",
                """
                        En proaktiv tilgang til risikoanalyse fokuserer på at identificere og håndtere risici, før de opstår, ved at planlægge og implementere foranstaltninger på forhånd.
                        
                        En reaktiv tilgang reagerer på risici, når de allerede er opstået, ved at håndtere dem og finde løsninger, efter de har påvirket projektet.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvilke faktorer bør tages i betragtning i en økonomisk feasibility-analyse?",
                """
                        I en økonomisk feasibility-analyse bør faktorer som omkostninger, potentielle indtægter, return on investment (ROI), finansieringsmuligheder, risici, tidsramme og de økonomiske fordele ved projektet overvejes for at vurdere, om projektet er økonomisk bæredygtigt.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en teknologisk feasibility-analyse bidrage til projektets succes?",
                """
                        En teknologisk feasibility-analyse vurderer, om de nødvendige teknologier og ressourcer er tilgængelige og egnede til projektet. Den kan bidrage til projektets succes ved at identificere teknologiske udfordringer tidligt, sikre, at de rette værktøjer og platforme anvendes, og minimere risikoen for teknologiske problemer undervejs.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvad betyder de enkelte elementer i en SWOT-analyse (styrker, svagheder, muligheder og trusler)?",
                """
                        I en SWOT-analyse betyder:
                        
                        Styrker (Strengths): De interne faktorer, der giver organisationen en fordel i forhold til konkurrenter.
                        Svagheder (Weaknesses): De interne faktorer, der hæmmer organisationens præstationer eller konkurrenceevne.
                        Muligheder (Opportunities): Eksterne faktorer, som organisationen kan udnytte til vækst eller forbedring.
                        Trusler (Threats): Eksterne faktorer, der kan påvirke organisationens succes negativt.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en SWOT-analyse hjælpe med at vurdere virksomhedens position i markedet?",
                """
                        En SWOT-analyse hjælper med at vurdere virksomhedens position i markedet ved at identificere interne styrker og svagheder samt eksterne muligheder og trusler. Dette giver et klart billede af virksomhedens konkurrenceevne, områder, hvor den kan forbedre sig, og hvordan den kan udnytte muligheder eller håndtere trusler i markedet.
                        """)
        );
        count++;
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                ITF,
                2,
                "Hvordan kan en juridisk feasibility-analyse hjælpe med at identificere potentielle lovgivningsmæssige udfordringer for projektet?",
                """
                        En juridisk feasibility-analyse vurderer, om projektet overholder gældende love og regler. Den hjælper med at identificere potentielle lovgivningsmæssige udfordringer ved at analysere juridiske krav, licenser, kontrakter, ophavsretter og andre relevante reguleringer, som kan påvirke projektets gennemførelse og succes.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        return questions;
    }
}
