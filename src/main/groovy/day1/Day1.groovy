package main.groovy.day1

import java.nio.file.Files
import java.nio.file.Paths

class Day1 {

    static void main(String[] args){

        List<Integer> measurements = Files.readAllLines(Paths.get('src/main/groovy/day1/input.txt')).stream().mapToInt({s -> s.toInteger()}).toArray()

        System.out.println("Part 1 solution: number of increase is: " + Part1.solution(measurements))
        System.out.println("Part 2 solution: number of increase is: " + Part2.solution(measurements))
    }

}
