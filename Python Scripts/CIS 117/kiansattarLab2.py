class Message:
    #Instance Members
    MAX_LENGTH = 50
    EMPTY_STRING = ""
    #Instance Methods
    #Constructor that initializes all instance members according to passed parameters
    def __init__(self, sender, recipient):
        self.__sender = self.EMPTY_STRING
        self.__recipient = self.EMPTY_STRING
        self.__body = []
        self.set_sender(sender)
        self.set_recipient(recipient)
    #Mutator method for sender instance member
    def set_sender(self, sender):
        if self.str_ok(sender):
            self.__sender = sender
        else:
            self.__sender = self.EMPTY_STRING
    #Mutator method for recipient intance member
    def set_recipient(self, recipient):
        if self.str_ok(recipient):
            self.__recipient = recipient
        else:
            self.__recipient = self.EMPTY_STRING
            print("Invalid Input")
    #Mutator method for body instance member
    def append(self, line):
        if self.str_ok(line):
            self.__body.append(line)
    #Helper method that returns a string representation of the message
    def to_String(self):
        string = "From: " + self.__sender + "\n"
        string += "To: " + self.__recipient + "\n"
        for line in self.__body:
            string += line + "\n"
        return string
    #Helper method for checking if input is valid
    def str_ok(self, the_str):
        return isinstance(the_str, str) and len(the_str) <= self.MAX_LENGTH
