@0 // initiarize i=0
D=A
@i
M=0
@0 // initiarize j=1
D=A
@j
M=0
(WHILE)
@j
M=M+1
D=M
@5
D=D-A
D;JEQ // if j==5 goto END
@WHILE
@END
@j
D=M
@i
M=D
(END)
0;JMP