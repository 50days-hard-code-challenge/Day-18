def isAnagram(str1, str2) :
	# write your code here.

	res1 = ''.join(sorted(str1))
	res2 = ''.join(sorted(str2))
	if res1==res2:
		return True
	else:
		return False
