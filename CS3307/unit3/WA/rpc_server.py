from xmlrpc.server import SimpleXMLRPCServer

def add(x, y):
    return x + y

server = SimpleXMLRPCServer(("localhost", 8000))
server.register_function(add, "add")
print("Server is running on port 8000...")
server.serve_forever()
