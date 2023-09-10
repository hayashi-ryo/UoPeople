@5 // initiarize j=5
D=A
@j
M=D // initiarize i=1
@i
M=1
(LOOP)
@i
D=M
@5
D=D-A
@END 
D;JGT // if(5-i)<=0 goto end
@i
D=M
@j
M=M-1
@i
M=M+1
@LOOP
0;JMP
@END
(END)
0;JMP