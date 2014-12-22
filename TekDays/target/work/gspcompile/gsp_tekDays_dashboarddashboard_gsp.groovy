import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_dashboarddashboard_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: "/"))
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',10,['controller':("task"),'action':("create"),'class':("create")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',11,['controller':("sponsorship"),'action':("create"),'class':("create")],2)
printHtmlPart(7)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',12,['controller':("sponsor"),'action':("index"),'class':("list")],2)
printHtmlPart(10)
invokeTag('render','g',17,['template':("event"),'model':(['event': event])],-1)
printHtmlPart(11)
invokeTag('render','g',21,['template':("tasks"),'model':(['tasks': tasks])],-1)
printHtmlPart(12)
invokeTag('render','g',25,['template':("volunteers"),'model':(['volunteers': volunteers])],-1)
printHtmlPart(13)
invokeTag('render','g',29,['template':("messages"),'model':(['messages': messages])],-1)
printHtmlPart(14)
invokeTag('render','g',33,['template':("sponsors"),'model':(['sponsorships': sponsorships])],-1)
printHtmlPart(15)
invokeTag('render','g',37,['template':("twitter"),'model':(['event': event])],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',39,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1419246234591L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
