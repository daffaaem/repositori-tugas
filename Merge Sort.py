def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        merge_sort(L)
        merge_sort(R)
        i = j = k = 0
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1
        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1
    return arr

print("Nama \t\t: Daffa Ammar Mahendra")
print("NPM \t\t: 22081010189")
print("Mata Kuliah \t: Kecerdasan Buatan A081")
print("========================================")

arr = [38, 27, 43, 3, 9, 82, 10, 304, 120, 20, 92, 1, 299]
print("Array sebelum diurutkan : ", arr)

arr = merge_sort(arr)
print("Array setelah diurutkan : ", arr)