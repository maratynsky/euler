import math

def get_next_true_index(arr, begin_index):
  for i in xrange(begin_index + 1, len(arr) - 1):
    if arr[i]:
      return i
  return len(arr)

def euler3():
  n = 600851475143
  d = int(math.sqrt(n))
  r = [True] * d
  p = 2

  while p <= d/2:
    for i in xrange(2*p, d, p):
      r[i] = False
    p = get_next_true_index(r, p)

  for i, e in reversed(list(enumerate(r))):
    if e and n % i == 0:
      return i



euler3()