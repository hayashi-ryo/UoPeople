@4 // initiarize i=4
M=A
D=M
@5
D=D-A
@IF
D;JGT // if i<5 goto IF
@ELSE
0;JMP // if i>=5 goto ELSE
(IF)
@2
D=A
(ELSE)
@3
D=A