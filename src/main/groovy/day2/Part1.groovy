package main.groovy.day2

class Part1 {

    private static int x = 0
    private static int y = 0

    static Integer solution(List<String> position) {

        position.collect({ s -> s.split(" ") }).each { it -> calcPos(it) }

        return x * y
    }

    static Integer calcPos(String[] pos) {
        if (pos[0] == 'forward') {
            return x = x + pos[1].toInteger()
        } else if (pos[0] == 'down') {
            return y = y + pos[1].toInteger()
        } else {
            return y = y - pos[1].toInteger()
        }
    }
}