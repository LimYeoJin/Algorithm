import heapq
import sys

n = int(sys.stdin.readline())

leftheap = []
rightheap = []
for i in range(n) : 
    num = int(sys.stdin.readline())

    if len(leftheap) == len(rightheap) :
        heapq.heappush(leftheap, -num)
    else :
        heapq.heappush(rightheap, num)

    if rightheap and rightheap[0] < -leftheap[0] :
        leftvalue = heapq.heappop(leftheap)
        rightvalue = heapq.heappop(rightheap)

        heapq.heappush(leftheap, -rightvalue)
        heapq.heappush(rightheap, -leftvalue)

    print(-leftheap[0])

