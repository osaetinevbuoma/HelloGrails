import com.tekdays.TekEvent
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_tekEventshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tekEvent/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tekEvent.label', default: 'TekEvent'))],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("jquery-ui-1.10.4.custom.min.css")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',17,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',17,['class':("create"),'action':("create")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',18,['class':("list"),'controller':("dashboard"),'action':("dashboard"),'id':(tekEventInstance.id)],2)
printHtmlPart(8)
invokeTag('volunteerButton','g',19,['eventId':(tekEventInstance.id)],-1)
printHtmlPart(10)
expressionOut.print(tekEventInstance?.name)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (tekEventInstance?.description)) {
printHtmlPart(15)
invokeTag('message','g',31,['code':("tekEvent.description.label"),'default':("Description")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',33,['bean':(tekEventInstance),'field':("description")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (tekEventInstance?.city)) {
printHtmlPart(19)
invokeTag('fieldValue','g',42,['bean':(tekEventInstance),'field':("venue")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',43,['bean':(tekEventInstance),'field':("city")],-1)
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (tekEventInstance?.startDate)) {
printHtmlPart(23)
invokeTag('message','g',51,['code':("tekEvent.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(24)
invokeTag('formatDate','g',54,['format':("MMMM dd, yyyy"),'date':(tekEventInstance?.startDate)],-1)
printHtmlPart(25)
}
printHtmlPart(22)
if(true && (tekEventInstance?.endDate)) {
printHtmlPart(26)
invokeTag('message','g',62,['code':("tekEvent.endDate.label"),'default':("End Date")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',65,['format':("MMMM dd, yyyy"),'date':(tekEventInstance?.endDate)],-1)
printHtmlPart(25)
}
printHtmlPart(22)
if(true && (tekEventInstance?.organizer)) {
printHtmlPart(28)
invokeTag('message','g',73,['code':("tekEvent.organizer.label"),'default':("Organizer")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(tekEventInstance?.organizer?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("tekUser"),'action':("show"),'id':(tekEventInstance?.organizer?.id)],3)
printHtmlPart(17)
}
printHtmlPart(22)
if(true && (tekEventInstance?.volunteers)) {
printHtmlPart(30)
invokeTag('message','g',82,['code':("tekEvent.volunteers.label"),'default':("Volunteers")],-1)
printHtmlPart(31)
for( v in (tekEventInstance.volunteers) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(v?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("tekUser"),'action':("show"),'id':(v.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(22)
if(true && (tekEventInstance?.sponsorships)) {
printHtmlPart(35)
invokeTag('message','g',93,['code':("tekEvent.sponsorships.label"),'default':("Sponsorships")],-1)
printHtmlPart(31)
for( s in (tekEventInstance.sponsorships) ) {
printHtmlPart(36)
createTagBody(4, {->
expressionOut.print(s?.sponsor.encodeAsHTML())
})
invokeTag('link','g',96,['controller':("sponsorship"),'action':("show"),'id':(s.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(22)
if(true && (tekEventInstance?.respondents)) {
printHtmlPart(37)
invokeTag('message','g',104,['code':("tekEvent.respondents.label"),'default':("Respondents")],-1)
printHtmlPart(38)
for( r in (tekEventInstance.respondents) ) {
printHtmlPart(39)
expressionOut.print(r.encodeAsHTML())
printHtmlPart(40)
}
printHtmlPart(34)
}
printHtmlPart(18)
if(true && (tekEventInstance?.tasks)) {
printHtmlPart(41)
invokeTag('message','g',116,['code':("tekEvent.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(42)
for( t in (tekEventInstance.tasks) ) {
printHtmlPart(43)
createTagBody(4, {->
expressionOut.print(t.title)
})
invokeTag('link','g',121,['controller':("task"),'action':("show"),'id':(t.id)],4)
printHtmlPart(44)
}
printHtmlPart(45)
}
printHtmlPart(22)
if(true && (tekEventInstance?.messages)) {
printHtmlPart(46)
invokeTag('message','g',129,['code':("tekEvent.messages.label"),'default':("Messages")],-1)
printHtmlPart(47)
createClosureForHtmlPart(48, 3)
invokeTag('link','g',132,['controller':("tekMessage"),'action':("index"),'id':(tekEventInstance.id)],3)
printHtmlPart(49)
}
printHtmlPart(50)
createTagBody(2, {->
printHtmlPart(51)
createTagBody(3, {->
invokeTag('message','g',140,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',140,['class':("edit"),'action':("edit"),'resource':(tekEventInstance)],3)
printHtmlPart(52)
invokeTag('actionSubmit','g',141,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(53)
})
invokeTag('form','g',143,['url':([resource:tekEventInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(54)
expressionOut.print(g.createLink(action: 'volunteer'))
printHtmlPart(55)
expressionOut.print(tekEventInstance.name)
printHtmlPart(56)
createTagBody(2, {->
printHtmlPart(57)
invokeTag('hiddenField','g',181,['name':("id"),'value':(tekEventInstance.id)],-1)
printHtmlPart(58)
})
invokeTag('form','g',183,['name':("volunteerForm"),'action':("volunteer")],2)
printHtmlPart(59)
})
invokeTag('captureBody','sitemesh',185,[:],1)
printHtmlPart(60)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1419245196396L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
