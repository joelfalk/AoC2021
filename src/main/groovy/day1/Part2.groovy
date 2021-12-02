package main.groovy.day1

class Part2 {
    static Integer solution(List<Integer> measurements) {
        Integer formerSum = Integer.MAX_VALUE
        Integer nOfIncrease = 0

        for (int i = 0; i < measurements.size() - 2; i++) {
            Integer sumOfMeasurements = measurements[i] + measurements[i + 1] + measurements[i + 2]

            if (sumOfMeasurements > formerSum) {
                nOfIncrease++
            }
            formerSum = sumOfMeasurements
        }
        return nOfIncrease
    }
}
