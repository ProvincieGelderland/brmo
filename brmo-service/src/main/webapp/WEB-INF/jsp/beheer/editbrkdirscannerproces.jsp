<%@include file="/WEB-INF/taglibs.jsp" %>
<table>
    <tr>
        <td><stripes:label name="">Label</stripes:label></td>
        <td><stripes:text name="config['label']"/></td>
    </tr>
    <tr>
        <td><stripes:label name="">Scan directory</stripes:label></td>
        <td><stripes:text name="config['scandirectory']" /></td>
    </tr>
    <tr>
        <td><stripes:label name="">Archief directory</stripes:label></td>
        <td><stripes:text name="config['archiefdirectory']"  /></td>
    </tr>
    <tr>
        <td><stripes:label name="">Planning (cron expressie)</stripes:label></td>
        <td><stripes:text name="proces.cronExpressie"/></td>
    </tr>
    <tr>
        <td><stripes:label name="">Commit page size (leeg voor default)</stripes:label></td>
        <td><stripes:text name="config['commitPageSize']"/></td>
    </tr>
</table>