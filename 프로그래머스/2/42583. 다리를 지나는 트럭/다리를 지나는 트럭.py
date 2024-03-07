from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    queue = deque([0]*bridge_length)
    truck = deque(truck_weights)
    
    cur = 0
    while truck :
        time += 1
        
        cur -= queue.popleft()
        if cur + truck[0] <= weight :
            cur += truck[0]
            queue.append(truck.popleft())
        else :
            queue.append(0)
            
    time += bridge_length
    
    return time