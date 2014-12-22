import com.tekdays.TekEvent
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_tekEvent_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tekEvent/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("tekEvent.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(tekEventInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'city', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("tekEvent.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("city"),'required':(""),'value':(tekEventInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'description', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("tekEvent.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textArea','g',28,['name':("description"),'cols':("40"),'rows':("5"),'maxlength':("5000"),'required':(""),'value':(tekEventInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'organizer', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("tekEvent.organizer.label"),'default':("Organizer")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("organizer"),'name':("organizer.id"),'from':(com.tekdays.TekUser.list()),'optionKey':("id"),'required':(""),'value':(tekEventInstance?.organizer?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'venue', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("tekEvent.venue.label"),'default':("Venue")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("venue"),'required':(""),'value':(tekEventInstance?.venue)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'startDate', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("tekEvent.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',55,['name':("startDate"),'precision':("day"),'value':(tekEventInstance?.startDate),'years':(2008..2015)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'endDate', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("tekEvent.endDate.label"),'default':("End Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',64,['name':("endDate"),'precision':("day"),'value':(tekEventInstance?.endDate),'years':(2008..2015)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'volunteers', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("tekEvent.volunteers.label"),'default':("Volunteers")],-1)
printHtmlPart(11)
invokeTag('select','g',73,['name':("volunteers"),'from':(com.tekdays.TekUser.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(tekEventInstance?.volunteers*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'sponsorships', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("tekEvent.sponsorships.label"),'default':("Sponsorships")],-1)
printHtmlPart(13)
for( s in (tekEventInstance?.sponsorships) ) {
printHtmlPart(14)
createTagBody(2, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("sponsorship"),'action':("show"),'id':(s.id)],2)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'sponsorship.label', default: 'Sponsorship')]))
})
invokeTag('link','g',88,['controller':("sponsorship"),'action':("create"),'params':(['tekEvent.id': tekEventInstance?.id])],1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'tasks', 'error'))
printHtmlPart(18)
invokeTag('message','g',97,['code':("tekEvent.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(13)
for( t in (tekEventInstance?.tasks) ) {
printHtmlPart(14)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',103,['controller':("task"),'action':("show"),'id':(t.id)],2)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'task.label', default: 'Task')]))
})
invokeTag('link','g',106,['controller':("task"),'action':("create"),'params':(['tekEvent.id': tekEventInstance?.id])],1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'messages', 'error'))
printHtmlPart(19)
invokeTag('message','g',115,['code':("tekEvent.messages.label"),'default':("Messages")],-1)
printHtmlPart(13)
for( m in (tekEventInstance?.messages) ) {
printHtmlPart(14)
createTagBody(2, {->
expressionOut.print(m?.encodeAsHTML())
})
invokeTag('link','g',121,['controller':("tekMessage"),'action':("show"),'id':(m.id)],2)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'tekMessage.label', default: 'TekMessage')]))
})
invokeTag('link','g',124,['controller':("tekMessage"),'action':("create"),'params':(['tekEvent.id': tekEventInstance?.id])],1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: tekEventInstance, field: 'respondents', 'error'))
printHtmlPart(20)
invokeTag('message','g',133,['code':("tekEvent.respondents.label"),'default':("Respondents")],-1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418643936949L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
