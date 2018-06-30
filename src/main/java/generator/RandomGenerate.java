package generator;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class RandomGenerate {
    private static final Random random = new Random();
    static final String STR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public String randomString() {
        StringBuilder stringBuilder = new StringBuilder(10);
        for (int i = 0; i < 10; i++)
            stringBuilder.append(STR.charAt(rnd.nextInt(STR.length())));
        return stringBuilder.toString();

    }

    public int randomInt() {
        return (int) Math.abs(Math.random() * 100);
    }

    public boolean randomBoolean() {
        return random.nextBoolean();
    }

    public Date randomDate() {
        long ms = -946771200000L + (Math.abs(random.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        return new Date(ms);
    }
}
