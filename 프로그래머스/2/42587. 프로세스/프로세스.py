def solution(priorities, location):
    answer = []
    queue = []
    
    for i, k in enumerate(priorities) :
        queue.append([i,k])
        
    while queue :
        process = queue.pop(0)
        if any(process[1] < q[1] for q in queue) :
            queue.append(process)
        else :
            answer.append(process)
        
    
    for i in range(len(answer)) :
        if location == answer[i][0] :
            return i+1
    
