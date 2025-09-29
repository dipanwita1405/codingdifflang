name = input("Enter your name: ")
print("Hello", name)

age = int(input("Enter your age: "))

# F-strings (recommended)
print(f"My name is {name} and I am {age} years old")

# Format method
print("Hello {} and welcome!".format(name))

# Old style formatting
print("Name: %s, Age: %d" % (name, age))

print(type(name))
print(type(age))