import com.tekdays.TekMessage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_tekMessage_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tekMessage/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (tekMessageInstance?.parent)) {
printHtmlPart(1)
expressionOut.print(tekMessageInstance?.parent?.id)
printHtmlPart(2)
invokeTag('hiddenField','g',5,['name':("parent.id"),'value':(tekMessageInstance?.parent?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'pareant', 'error'))
printHtmlPart(4)
expressionOut.print(tekMessageInstance?.parent?.author)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'subject', 'error'))
printHtmlPart(7)
invokeTag('message','g',14,['code':("tekMessage.subject.label"),'default':("Subject")],-1)
printHtmlPart(8)
invokeTag('textField','g',17,['class':("messageField"),'name':("subject"),'required':(""),'value':(tekMessageInstance?.subject)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'content', 'error'))
printHtmlPart(10)
invokeTag('message','g',23,['code':("tekMessage.content.label"),'default':("Content")],-1)
printHtmlPart(8)
invokeTag('textArea','g',26,['class':("messageField"),'name':("content"),'cols':("40"),'rows':("5"),'maxlength':("2000"),'required':(""),'value':(tekMessageInstance?.content)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'parent', 'error'))
printHtmlPart(12)
invokeTag('message','g',32,['code':("tekMessage.parent.label"),'default':("Parent")],-1)
printHtmlPart(13)
invokeTag('select','g',35,['id':("parent"),'name':("parent.id"),'from':(com.tekdays.TekMessage.list()),'optionKey':("id"),'value':(tekMessageInstance?.parent?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'author', 'error'))
printHtmlPart(15)
invokeTag('message','g',41,['code':("tekMessage.author.label"),'default':("Author")],-1)
printHtmlPart(8)
invokeTag('select','g',44,['id':("author"),'name':("author.id"),'from':(com.tekdays.TekUser.list()),'optionKey':("id"),'required':(""),'value':(tekMessageInstance?.author?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'event', 'error'))
printHtmlPart(16)
invokeTag('message','g',50,['code':("tekMessage.event.label"),'default':("Event")],-1)
printHtmlPart(8)
invokeTag('select','g',53,['id':("event"),'name':("event.id"),'from':(com.tekdays.TekEvent.list()),'optionKey':("id"),'required':(""),'value':(tekMessageInstance?.event?.id),'class':("many-to-one")],-1)
printHtmlPart(17)
invokeTag('hiddenField','g',56,['name':("event.id"),'value':(tekMessageInstance?.event?.id)],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418726448174L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
