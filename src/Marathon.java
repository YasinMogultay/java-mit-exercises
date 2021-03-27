class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + times[i]);
//        }
        int numo = times[0];
        System.out.println(numo);
        getMinIndex(times);
        getSecondMinIndex(times);
    }

    public static int getMinIndex (int[] input) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < input.length; i++)
            if (input[i] < minValue) {
                minValue = input[i];
                minIndex += i;
            }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx= getMinIndex(values);
        for(int i=0; i<values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;

        }

        return secondIdx;

    }


}

