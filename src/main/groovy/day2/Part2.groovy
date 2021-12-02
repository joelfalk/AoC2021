package main.groovy.day2

class Part2 {

    private static int x = 0
    private static int y = 0
    private static int aim = 0

    static Integer solution(List<String> measurement) {

        measurement.collect({ s -> s.split(" ") }).each { it -> calcPos(it) }

        return x * y
    }

    static Integer calcPos(String[] pos) {
        if (pos[0] == 'forward') {
            x += pos[1].toInteger()
            y += (aim * pos[1].toInteger())
        } else if (pos[0] == 'down') {
            return aim = aim + pos[1].toInteger()
        } else {
            return aim = aim - pos[1].toInteger()
        }
    }
}