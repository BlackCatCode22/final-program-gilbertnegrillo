// References: JavaFinalProgramDemo01.class file, midterm program file

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.Period;
public class Spr23JavaFinalProgram {
    // Create birthDate method
    static String genBirthDay(int yearsOld, String birthSeason) {
        int year = 2023 - yearsOld;
        String monthDay;
        String newDate;

        if (birthSeason.equals("spring,")) {
            monthDay = "03-21";
        } else if (birthSeason.equals("summer,")) {
            monthDay = "06-21";
        } else if (birthSeason.equals("fall,")) {
            monthDay = "09-21";
        } else if (birthSeason.equals("winter,")) {
            monthDay = "12-21";
        } else {
            monthDay = "01-01";
        }
        newDate = Integer.toString(year) + "-" + monthDay;

        return newDate;
    }
    // Generate unique ID method that starts with a two-character representation for each species
    static String genUanimalID(String speciesName, int numOfSpecies) {

        String uniqueID;

        if (speciesName.equals("hyena")) {
            uniqueID = "Hy0" + Integer.toString(numOfSpecies);
        } else if (speciesName.equals("lion")) {
            uniqueID = "Li0" + Integer.toString(numOfSpecies);
        } else if (speciesName.equals("tiger")) {
            uniqueID = "Ti0" + Integer.toString(numOfSpecies);
        } else if (speciesName.equals("bear")) {
            uniqueID = "Be0" + Integer.toString(numOfSpecies);
        } else {
            uniqueID = "error";
        }
        return uniqueID;
    }
    public static void main(String[] args) {
        // Linked lists for each animal habitat
        // From ZooAnimals class
        LinkedList<ZooAnimals> hyenaHabitat = new LinkedList<>();
        LinkedList<ZooAnimals> lionHabitat = new LinkedList<>();
        LinkedList<ZooAnimals> tigerHabitat = new LinkedList<>();
        LinkedList<ZooAnimals> bearHabitat = new LinkedList<>();

        // Read arrivingAnimals input file
        // Use try/catch block for file i/o
        try {
            String filePath = "C:/Users/bertn/IdeaProjects/final-program-gilbertnegrillo/arrivingAnimals.txt";
            Scanner scanner = new Scanner(new File(filePath));

            // Set numZooAnimals value to 0
            int numZooAnimals = 0;
            // While loop
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(", ");
                System.out.println("\n\n line = " + line);
                
                int age = 99;
                String species = line[0].split(" ")[4];
                System.out.println("\n Species = " + species);
                // Output species
                String birthSeason = line[1];
                String color = line[2];
                String gender = line[3];
                int weight = 9999;
                String location = line [5];
                String location02 = location + "02";
                // Animal ID "An#"
                String id = "An" + numZooAnimals;
                String name = "unnamed";
                String birthDate = birthSeason;

                // ZooAnimals constructor (use same name as class)
                // Parameters list
                ZooAnimals zooAnimals = new ZooAnimals(id, species, name, age, birthDate, color, gender, weight, location, location02);
                switch (species) {
                    case "hyena":
                        hyenaHabitat.add(zooAnimals);
                        break;
                    case "lion":
                        lionHabitat.add(zooAnimals);
                        break;
                    case "tiger":
                        tigerHabitat.add(zooAnimals);
                        break;
                    case "bear":
                        bearHabitat.add(zooAnimals);
                        break;
                }

                // Output the new animal
                // Use ZooAnimals class for new animal object
                System.out.println("\n new animal is: " + zooAnimals.toString());
                System.out.println("\n" + zooAnimals.getId());
                System.out.println("\n" + zooAnimals.getSpecies());
                System.out.println("\n" + zooAnimals.getName());
                System.out.println("\n" + zooAnimals.getAge());
                System.out.println("\n" + zooAnimals.getBirthDate());
                System.out.println("\n" + zooAnimals.getColor());
                System.out.println("\n" + zooAnimals.getGender());
                System.out.println("\n" + zooAnimals.getWeight());
                System.out.println("\n" + zooAnimals.getOrigin());
                System.out.println("\n" + zooAnimals.getArrivalDate());

                numZooAnimals++;
                // Increment numZooAnimals
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        }

        // Output hyena habitat
        System.out.println("Hyena Habitat:\n");
        for (ZooAnimals zooAnimals : hyenaHabitat) {
            System.out.println(zooAnimals.toString());
            System.out.println("number of animals is: " + zooAnimals.getNumOfAnimals());
        }

        // Output lion habitat
        System.out.println("\n Lion Habitat:\n");
        for (ZooAnimals zooAnimals : lionHabitat) {
            System.out.println(zooAnimals.toString());
            System.out.println("number of animals is: " + zooAnimals.getNumOfAnimals());
        }

        // Output tiger habitat
        System.out.println("\n Tiger Habitat:\n");
        for (ZooAnimals zooAnimals : tigerHabitat) {
            System.out.println(zooAnimals.toString());
            System.out.println("number of animals is: " + zooAnimals.getNumOfAnimals());
        }

        // Output bear habitat
        System.out.println("\n Bear Habitat:\n");
        for (ZooAnimals zooAnimals : bearHabitat) {
            System.out.println(zooAnimals.toString());
            System.out.println("number of animals is: " + zooAnimals.getNumOfAnimals());
        }

        // Output file
        // Use PrintWriter to write info for each animal habitat
        try {
            String habitatAnimals = "C:/Users/bertn/IdeaProjects/final-program-gilbertnegrillo/animalsHabitatOutputFile.txt";
            PrintWriter writer = new PrintWriter(new File(habitatAnimals));

            writer.println("Hyena Habitat:\n");
            for (ZooAnimals zooAnimals : hyenaHabitat) {
                writer.println(zooAnimals.toString());
            }
            writer.println();

            writer.println("Lion Habitat:\n");
            for (ZooAnimals zooAnimals : lionHabitat) {
                writer.println(zooAnimals.toString());
            }
            writer.println();

            writer.println("Tiger Habitat:\n");
            for (ZooAnimals zooAnimals : tigerHabitat) {
                writer.println(zooAnimals.toString());
            }
            writer.println();

            writer.println("Bear Habitat:\n");
            for (ZooAnimals zooAnimals : bearHabitat) {
                writer.println(zooAnimals.toString());
            }
            writer.println();

            writer.close();

        } catch(FileNotFoundException e) {
            System.out.println("Output file not found");
        }

        // Global variables to measure species population
        // Set value to 0
        int numOfHyenas = 0;
        int numOfLions = 0;
        int numOfTigers = 0;
        int numOfBears = 0;

        // There are a total of four animals of each species
        // Four elements and four arrays
        String hyenas[] = new String[4];
        String lions[] = new String[4];
        String tigers[] = new String[4];
        String bears[] = new String[4];

        // String array with sixteen elements.
        // Elements are initialized to a null string.
        String arrivingAnimals[] = new String[16];
        String filePath = "C:/Users/bertn/IdeaProjects/final-program-gilbertnegrillo/arrivingAnimals.txt";
        String nextLine = "";

        // Use BufferedReader to open arrivingAnimals file
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            System.out.println("\n arrivingAnimals.txt file  \n");
            // lineNum is set to 0 for the while loop
            // nextLine is an empty string
            // BufferedReader object has sixteen lines of text
            // While loop has a readLine method to read a line of text
            int lineNum = 0;
            while ((nextLine = br.readLine()) !=null) {
                // Read a line from the BufferedReader into a string object using nextLine.
                // nextLine is assigned to arrivingAnimals[] array
                arrivingAnimals[lineNum] = nextLine;
                // Increment lineNum
                lineNum++;
                System.out.println(nextLine);
                // Output each line
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the array
        System.out.println("\n The array \n");
        for(String line : arrivingAnimals) {
            System.out.println(line);
        }

        // position variable used to process string
        int position = 0;
        // Variables to process the arrivingAnimals array
        int years = 0;
        String season;
        String sex;
        String species;
        String birthdate;
        String color;
        String origin;
        String weight;
        String name;
        String uniqueID = "xyz";
        String arrived;

        // Animal names
        // Use 1D array with the names
        String hyenaNames[] = {"Shenzi", "Banzai", "Ed", "Zig", "Bud", "Lou", "Kamari", "Wema", "Nne", "Madoa", "Prince Nevarah"};
        String lionNames[] = {"Scar", "Mufasa", "Simba", "Kiara", "King", "Drooper", "Kimba", "Nala", "Leo", "Samson", "Elsa", "Cecil"};
        String tigerNames[] = {"Tony", "Tigger", "Amber", "Cosimia", "Cuddles", "Dave", "Jiba", "Rajah", "Rayas", "Ryker"};
        String bearNames[] = {"Yogi", "Smokey", "Paddington", "Lippy", "Bungle", "Baloo", "Rupert", "Winnie the Pooh", "Snuggles", "Bert"};

        // Create a for loop that goes through the arrivingAnimals[] array 16 times.
        for (int i = 0; i < 16; i++) {
            // split() method used to split the string into words
            // i = the index for arrivingAnimals[] array
            // arrivingAnimals[] array is a String object
            // split() method has two arguments: first argument is what to split on
            // Second argument is the limit that tells the split how many splits to create.
            // Create an array of Strings to get the new split words
            String splitStr[] = arrivingAnimals[i].split(" ",0);
            // Time to output the split
            // Use a for loop using "this in that"
            // Loop through splitStr[] until all the array elements are found
            for (String s : splitStr) {
                System.out.println("\n" + s);
            }

            // Two elements are needed from the split to calculate birthday - years and season
            // Use yearsOld and birthSeason to calc. birthday
            birthdate = genBirthDay(Integer.parseInt(splitStr[0]), splitStr[7]);
            System.out.println("birthdate is: " + birthdate);

            // Find the sex of the arriving animal
            sex = splitStr[3];
            System.out.println("sex is: " + sex);

            // Find the species of the arriving animal
            species = splitStr[4];
            System.out.println("species is: " + species);

            // Remove the trailing comma
            position = species.indexOf(",");
            System.out.println("position of comma is: " + position);

            // substring() method with two arguments
            species = species.substring(0, position);
            System.out.println("species is now: " + species);

            // Update global variable matching to the species
            // Generate unique ID since the # of animals in a species us updated
            // Can use genUanimalID() because one of the arguments uses numOfAnimals
            switch (species) {
                case "hyena":
                    numOfHyenas++;
                    uniqueID = genUanimalID(species, numOfHyenas);
                    break;
                case "lion":
                    numOfLions++;
                    uniqueID = genUanimalID(species, numOfLions);
                    break;
                case "tiger":
                    numOfTigers++;
                    uniqueID = genUanimalID(species, numOfTigers);
                    break;
                case "bear":
                    numOfBears++;
                    uniqueID = genUanimalID(species, numOfBears);
                    break;
                default:
                    System.out.println("An error occurred organizing the number of animals");
            }

            // Check the number of animals and unique ID
            System.out.println("numOfHyenas = " + numOfHyenas);
            System.out.println("numOfLions = " + numOfLions);
            System.out.println("numOfTigers = " + numOfTigers);
            System.out.println("numOfBears = " + numOfBears);

            System.out.println("UniqueID = " + uniqueID);

            // The index from splitStr() cannot be used
            // The color of each arriving animals have different number of words
            // Use split() for the commas instead of splitStr()
            String splitStrComma[] = arrivingAnimals[i].split(",", 0);
            // Output split
            for (String s : splitStrComma) {
                System.out.println(s);
            }

            // Find color
            color = splitStrComma[2];
            System.out.println("color = " + color);

            // Find weight
            weight = splitStrComma[3];
            System.out.println("weight = " + weight);

            // Find origin
            origin = splitStrComma[4] + "," + splitStrComma[5];
            System.out.println("origin = " + origin);

            // Unique ID is used to get a name
            String uniqueIDPrefix = uniqueID.substring(0, 2);
            System.out.println("UniqueIDPrefix = " + uniqueIDPrefix);

            String uniqueIDSuffix = uniqueID.substring(2);
            System.out.println("UniqueIDSuffix = " + uniqueIDSuffix);

            int suffixAsInt = Integer.parseInt(uniqueIDSuffix);
            System.out.println("suffixAsInt = " + suffixAsInt);
            // We can get a name that isn't used since we have unique ID and the numOfAnimals of a species

            // Switch statment
            switch (uniqueIDPrefix) {
                case "Hy":
                    name = hyenaNames[suffixAsInt];
                    break;
                case "Li":
                    name = lionNames[suffixAsInt];
                    break;
                case "Ti":
                    name = tigerNames[suffixAsInt];
                    break;
                case "Be":
                    name = bearNames[suffixAsInt];
                    break;
                default:
                    name = "Error occurred";
                    break;
            }

            System.out.println("name is: " + name);

            // Calculate animal's age in years and the arrival date using system date
            String arrivalDate;
            // Create localDate variable
            LocalDate curDate = LocalDate.now();
            arrivalDate = curDate.toString();
            System.out.println("arrivalDate: " + arrivalDate);
            LocalDate bDate = LocalDate.parse(birthdate);

            // LocalDate class
            // birthDate and arrivalDate need to be in the same format (YYYY-MM-DD)
            int animalAge = Period.between(bDate, curDate).getYears();
            System.out.println(" Age is: " + animalAge);

            // Check sample output
            String outputLine;
            outputLine = uniqueID + "; " + name + "; " + animalAge + " years old" + "; " + "birth date " + birthdate + "; " + color + "; " + sex + "; " + weight + "; " + origin + "; " + " arrived " + arrivalDate;
            System.out.println("\n\n" + outputLine + "\n\n");

            // Put the animal in the right species array
            if (species.equals("hyena")) {
                hyenas[numOfHyenas-1] = outputLine;
            } else if (species.equals("lion")) {
                lions[numOfLions-1] = outputLine;
            } else if (species.equals("tiger")) {
                tigers[numOfTigers-1] = outputLine;
            } else if (species.equals("bear")) {
                bears[numOfBears-1] = outputLine;
            }
        }

        // Output the four arrays.
        System.out.println("\nHyena Habitat\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(hyenas[i]);
        }
        System.out.println("\nLion Habitat\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(lions[i]);
        }
        System.out.println("\nTiger Habitat\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(tigers[i]);
        }
        System.out.println("\nBear Habitat\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(bears[i]);
        }

        // Use BufferedWriter to write the output file
        try {
            FileWriter file = new FileWriter("C:/Users/bertn/IdeaProjects/final-program-gilbertnegrillo/JavaOutputFile.txt");
            BufferedWriter output = new BufferedWriter(file);

               // Use output.write instead of System.out.println()
            output.write("Hyena Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(hyenas[i]+"\n");
            }

            output.write("\nLion Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(lions[i]+"\n");
            }

            output.write("\nTiger Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(tigers[i]+"\n");
            }

            output.write("\nBear Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(bears[i]+"\n");
            }

            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}