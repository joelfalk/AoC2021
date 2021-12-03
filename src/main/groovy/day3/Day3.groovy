package main.groovy.day3

import main.groovy.day2.Part1
import main.groovy.day2.Part2
import org.codehaus.groovy.classgen.asm.BinaryDoubleExpressionHelper

import java.nio.file.Files
import java.nio.file.Paths

class Day3 {

    static void main(String[] args) {

        List<Integer> measurements = Files.readAllLines(Paths.get('src/main/groovy/day3/input.txt'))

        def test = ['00100', '11110', '10110', '10111', '10101', '01111', '00111', '11100', '10000', '11001', '00010', '01010']

        test.collect { s -> s.split('(?!^)') }


    }

    static Integer[][] transpose(ArrayList<String> m) {
        int r = m.length
        int c = m[r].length
        Integer[][] t = new Integer[c][r]
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                t[j][i] = m[i][j]
            }
        }
        return t
    }


}