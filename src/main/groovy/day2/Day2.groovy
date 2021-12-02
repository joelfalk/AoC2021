package main.groovy.day2

import java.nio.file.Files
import java.nio.file.Paths

class Day2 {

    static void main(String[] args) {

        List<String> measurements = Files.readAllLines(Paths.get('src/main/groovy/day2/input.txt'))

        def test = ["forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2"]

        println('Solution 1: ' + Part1.solution(measurements))
        println('Solution 2: ' + Part2.solution(measurements))


    }


}