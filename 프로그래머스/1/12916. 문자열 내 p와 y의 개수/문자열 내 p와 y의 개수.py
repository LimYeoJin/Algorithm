def solution(s):
    p, y = 0,0
    
    for i in s :
        if i.lower() == 'p':
            p += 1
        elif i.lower() == 'y':
            y += 1
    return p==y