import java.util.Random;
public class bai3 {

        public static void main(String[] args) {
            Random random = new Random();

            boolean randomBoolean = random.nextBoolean();
            System.out.println("Giá trị : " + randomBoolean);

            int randomInt = random.nextInt();
            System.out.println("Số nguyên: " + randomInt);

            int randomIntInRange = random.nextInt(100);
            System.out.println("Số nguyên : " + randomIntInRange);

            long randomLong = random.nextLong();
            System.out.println("Số long : " + randomLong);

            float randomFloat = random.nextFloat();
            System.out.println("Số float : " + randomFloat);

            double randomDouble = random.nextDouble();
            System.out.println("Số double: " + randomDouble);

            double randomGaussian = random.nextGaussian();
            System.out.println("Số Gaussian : " + randomGaussian);

            byte[] randomBytes = new byte[10];
            random.nextBytes(randomBytes);
            System.out.print("Mảng byte : ");
            for (byte b : randomBytes) {
                System.out.print(b + " ");
            }
            System.out.println();

            random.setSeed(123);
            int seededRandomInt = random.nextInt();
            System.out.println("Số nguyên với seed 123: " + seededRandomInt);

            int randomIntWithinLimit = random.nextInt(60);
            System.out.println("Số nguyên phạm vi [0, 60): " + randomIntWithinLimit);
        }
    }


