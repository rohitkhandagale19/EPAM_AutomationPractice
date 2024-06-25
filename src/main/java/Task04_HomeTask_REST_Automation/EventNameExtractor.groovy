import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()
def jsonResponse = '''{
    "events": [
        {"name": "Event 1", "language": "En"},
        {"name": "Event 2", "language": "Fr"},
        {"name": "Event 3", "language": "En"}
    ]
}'''

def events = jsonSlurper.parseText(jsonResponse).events
def englishEvents = events.findAll { it.language == 'En' }.collect { it.name }

println(englishEvents)
