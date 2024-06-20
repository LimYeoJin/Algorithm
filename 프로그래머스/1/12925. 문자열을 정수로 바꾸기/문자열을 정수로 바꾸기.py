def solution(s):
    if s.isdigit() :
        return int(s)
    elif s[0] == '+':
        return int(s)
    else :
        return -1 * int(s[1:])