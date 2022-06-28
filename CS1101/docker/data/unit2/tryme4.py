def new_line():  # print new line
    print('.')


def three_lines():  # print three lines
    new_line()
    new_line()
    new_line()


# print nine lines = 3 * three lines
# By calling the Three_lines function three times, nine lines can be printed
def nine_lines():
    three_lines()
    three_lines()
    three_lines()


# print twenty-five lines
# twenty-five = nine * 2 + three * 2 + 1
def clear_screen():
    nine_lines()
    nine_lines()
    three_lines()
    three_lines()
    new_line()


print("execute nine_lines")

nine_lines()

print("execute clear_screen")

clear_screen()
