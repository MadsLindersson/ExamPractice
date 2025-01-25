package org.example.exampractice.Service;

import org.example.exampractice.Model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.example.exampractice.Model.Question.Subjects.*;

@Service
public class QuestionService {

    public Question randomQuestionUsingParam (String subject, int semesterInt)   {

        return switch (subject) {
            case "AlleFag" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("AlleFag", semesterInt);
                int randomIndexAllSubjects = (int) (Math.random() * questions.size());
                yield questions.get(randomIndexAllSubjects);
            }
            case "Programmering" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("Programmering", semesterInt);
                int randomIndexProgramming = (int) (Math.random() * questions.size());
                yield questions.get(randomIndexProgramming);
            }
            case "SU" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("SU", semesterInt);
                int randomIndexSU = (int) (Math.random() * fetchListOfQuestionsBySubject("SU", semesterInt).size());
                yield questions.get(randomIndexSU);
            }
            case "Teknologi" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("Teknologi", semesterInt);
                int randomIndexTech = (int) (Math.random() * fetchListOfQuestionsBySubject("Teknologi", semesterInt).size());
                yield questions.get(randomIndexTech);
            }
            case "ITF" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("ITF", semesterInt);
                int randomIndexITF = (int) (Math.random() * fetchListOfQuestionsBySubject("ITF", semesterInt).size());
                yield questions.get(randomIndexITF);
            }
            default -> new Question(1, null,1, "", "");
        };
    }

    public List<Question> fetchListOfQuestionsBySubject (String subject, int semesterInt) {
        List<Question> questions = new ArrayList<>();

        if(subject.equals("AlleFag") && semesterInt == 1) {
            for (Question element : makeListOfQuestions()) {
                if (element.getSemester() == 1) {
                    questions.add(element);
                }
            }
        } else if(subject.equals("AlleFag") && semesterInt == 2) {
                for (Question element : makeListOfQuestions()) {
                    if (element.getSemester() == 2) {
                        questions.add(element);
                    }
                }
        } else if (semesterInt == 1) {
            for (Question element : makeListOfQuestions()) {
                if (element.getSemester() == 1 && element.getSubject().toString().equals(subject)) {
                    questions.add(element);
                }
            }
        } else if (semesterInt == 2) {
            for (Question element : makeListOfQuestions()) {
                if (element.getSemester() == 1 || element.getSemester() == 2 && element.getSubject().toString().equals(subject)) {
                    questions.add(element);
                }
            }
        }
        return questions;
    }

    public List<Question> makeListOfQuestions()   {
        List<Question> questions = new ArrayList<Question>();

        int count = 1;
//1. semester:--------------------------------------------------------------------------------------------------------//
//Programmerings spørgsmål:-------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
//Systemudvikling spørgsmål:------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
//Teknologi spørgsmål:------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
//It- Og Forretningsforståelse spørgsmål:-----------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//

//2. semester:--------------------------------------------------------------------------------------------------------//
//Programmerings spørgsmål:-------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er forskellen på en LinkedList og en ArrayList?",
                """
                        En LinkedList bruger noder til at lagre data, hvor hver node indeholder en reference til næste (og eventuelt forrige) node. Det gør indsættelse og sletning hurtigere midt i listen, men adgang til elementer langsom.
                        
                        En ArrayList lagrer data i en kontinuerlig blok af hukommelse, hvilket gør adgang til elementer hurtig, men indsættelse og sletning langsommere på grund af behovet for at flytte elementer.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er en LinkedList?",
                """
                        En LinkedList er en datalstruktur, hvor elementerne er organiseret som noder, der hver indeholder en værdi og en reference (peger) til den næste node i listen. Denne struktur gør det nemt at indsætte og fjerne elementer i midten af listen, men adgang til elementer er langsommere end andre datastrukture som f.eks. ArrayList.
                        """)
        );
        count++;

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
                2,
                "Hvad er et ER-diagram? Og hvad er formålet med dette?",
                """
                        Et ER-diagram (Entity-Relationship-diagram) er en visuel repræsentation af data og deres relationer i en database. Det viser entiteter (tabeller), deres attributter (kolonner) og relationer mellem dem.
                        
                        Formålet er at planlægge og designe en databases struktur på en klar og organiseret måde, hvilket hjælper med at forstå data og deres sammenhænge inden implementering.""")
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
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
                Programmering,
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
                Programmering,
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
                Programmering,
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
                Programmering,
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
                Programmering,
                2,
                "Hvordan kan normalisering hjælpe med at reducere redundans og øge dataintegritet?",
                """
                        Normalisering hjælper med at reducere redundans ved at opdele data i mindre tabeller og fjerne gentagne informationer. Dette sikrer, at hver enhed kun optræder én gang i systemet. Samtidig øger det dataintegriteten ved at minimere risikoen for inkonsistente opdateringer, da data kun skal opdateres ét sted.
                        """)
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
                "Hvad er DDL (Data Definition Language?)",
                """
                        DDL (Data Definition Language) er en del af SQL, der bruges til at definere og ændre strukturen af databaser og tabeller. DDL-kommandoer omfatter CREATE, ALTER, DROP, og TRUNCATE, som bruges til at oprette, ændre, slette eller rydde tabeller og andre databaseobjekter.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er DML (Data Manipulation Language)?",
                """
                        DML (Data Manipulation Language) er en del af SQL, der bruges til at manipulere data i en database. DML-kommandoer omfatter SELECT, INSERT, UPDATE, og DELETE, som bruges til at hente, indsætte, opdatere eller slette data i tabeller.
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
                "Hvad er en Iterator i forbindelse med en LinkedList?",
                """
                        En Iterator i forbindelse med en LinkedList er et objekt, der gør det muligt at traversere (gennemgå) listen element for element. Den giver metoder som hasNext() for at kontrollere, om der er flere elementer, og next() for at hente det næste element i listen. Iteratoren hjælper med at navigere gennem en LinkedList uden at bruge indeksering direkte.
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
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er Git?",
                """
                        Git er et versionsstyringssystem, der bruges til at spore ændringer i filer og samarbejde om projekter. Det gør det muligt for flere udviklere at arbejde på samme kodebase samtidig, gemme versioner af koden og nemt rulle ændringer tilbage, hvis det er nødvendigt. Git er decentraliseret, hvilket betyder, at hver udvikler har en lokal kopi af hele projektet.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er GitHub?",
                """
                        GitHub er en webbaseret platform, der hoster Git-repositories og muliggør samarbejde om softwareudviklingsprojekter. Den tilbyder funktioner som versionkontrol, pull requests, issues og code review, og gør det nemt for udviklere at dele og arbejde på kode sammen online. Git og GitHub er ikke det samme; Git er et versionsstyringssystem, mens GitHub er en platform, der bruger Git til at administrere kode online.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er den relationelle datamodel?",
                """
                        Den relationelle datamodel er en måde at organisere data i tabeller (relationer), hvor hver tabel består af rækker (poster) og kolonner (attributter). Data i forskellige tabeller kan være forbundet ved hjælp af nøgler, som f.eks. primærnøgler og fremmednøgler. Modellen bruges i relationelle databaser som MySQL.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
                2,
                "Hvad er en database tabel? Og hvad er en database kolonne?",
                """
                        En database tabel er en struktur i en database, der organiserer data i rækker og kolonner. Hver tabel repræsenterer en samling af relaterede data, som f.eks. kunder, ordrer eller produkter.
                        """)
        );
        count++;

//--------------------------------------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                Programmering,
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

//Systemudviklings spørgsmål:-----------------------------------------------------------------------------------------//
        questions.add(new Question(count,
                SU,
                2,
                "Hvad er formålet med et klassediagram?",
                """
                        Formålet med et klassediagram er at vise strukturen af en applikation ved at beskrive klasser, deres attributter, metoder og relationer (som arv eller association) til andre klasser. Det hjælper med at visualisere og planlægge, hvordan forskellige objekter i systemet interagerer, og giver et klart billede af systemets design.
                        """)
        );
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
                        En acceptancetest er en test, der bruges til at kontrollere, om et system eller en funktion opfylder de krav, der er sat af kunden eller slutbrugeren. Formålet med testen er at sikre, at systemet fungerer som forventet i en realistisk situation og er klar til at blive taget i brug. Et eksempel kunne være at teste, om en bruger kan oprette en konto, logge ind og gennemføre et køb på en e-handelsplatform, for at sikre at alle funktioner fungerer korrekt.
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

//Teknologi-----------------------------------------------------------------------------------------------------------//
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

//IT- og Forretningsforståelse:---------------------------------------------------------------------------------------//
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
        return questions;
    }
}

