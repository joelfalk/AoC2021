package main.groovy.day1

class Part1 {

    static Integer solution(List<Integer> measurements) {

        Integer formerMeasurement = Integer.MAX_VALUE
        Integer nOfIncrease = 0

        for (Integer measurement : measurements) {
            if (measurement > formerMeasurement) {
                nOfIncrease++
            }
            formerMeasurement = measurement
        }
        return nOfIncrease
    }
}
