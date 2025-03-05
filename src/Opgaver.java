public class Opgaver {
    public static void main(String[] args) {
// Opgave 1
        int i = 1;
        do {
            System.out.println("Hello World");
            ++i;
        } while (i <= 3);


// Opgave 2
        int o = 1;
        do {
            System.out.println(o);
            ++o;
        } while (o <= 10);


//Opgave 3
        for (int l = 0; l < 10; l++) {
            System.out.println("e");
            ++i;
        }
//Opgave 4

        int k = 5;
        while (k >=-5) {
            System.out.println(k);
            --k;
        }
//Opgave 5

        int k1 = 5;
        while (k1 <= 30) {
            System.out.println(k1);
            k1 += 3;
        }

//Opgave 6
// Den printer uendeligt da counter større eller i ligemed 10
                //int count = 10;

                //while (count >= 0) {
                 //   System.out.println("Countdown: " + count);
               // }
              //  System.out.println("Finished running loop!");

 //opgave 7
  // A   Sum og count gør hvad den skal men sum er bagud fordi den bliver sat efter print og den tæller ikke op til 10 men 9
  // B   Den er bagud fordi at den opdateres efter print så den er bagud en iteration
  // C   ikke ummildbart
                int count = 0;
                int sum = 0;

                do {
                    System.out.println("Currrent count is " + count);
                    System.out.println("Currrent sum is " + sum);
                    sum += count;
                    count++;
                } while(count > 0 && count < 10);


 // Opgave 8

        for (int m = 2; m <= 12; m += 2){
            System.out.println(m);
        }


        for (int n = 4; n <= 79; n += 15){
            System.out.println(n);
        }

        for (int z = 30; z >= -20; z -= 10){
            System.out.println(z);
        }

        for (int c = -7; c <= 13; c += 4){
            System.out.println(c);
        }

        for (int v = 97; v >= 82; v -= 3){
            System.out.println(v);
        }

        //Opgave 9
                for (int b = 1; b <= 3; b++) { // Ydre loop
                    for (int j = 1; j <= 2; j++) { // Indre loop
                        System.out.println("b = " + b + ", j = " + j);
                    }
                }

        // A b stiger med 1 hver anden gang og j stiger med en og falder med en
        //B den bliver printet i alt 6 gange i konsollen og i koden bliver det skrevet en gang
        // ^a


        for (int by= 3; by >= 0; by-- ) { // Ydre loop
            for (int j = 0; j <= 2; j++) { // Indre loop
                System.out.println("by = " + by + ", j = " + j);
            }
        }





















    }
}
