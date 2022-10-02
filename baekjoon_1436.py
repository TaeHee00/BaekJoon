import sys

n = int(sys.stdin.readline())
# 숫자를 입력받고
cnt = 0
# 몇번째 영화인지 확인
six_n = 666
while True:
    if '666' in str(six_n):
        # 숫자안에 666이 있을경우 카운트 1추가
        cnt += 1
    if cnt == n:
        #  카운트가 원하는 숫자랑 같을경우 끝
        print(six_n)
        break
    six_n += 1
