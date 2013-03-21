<div class="list">
    <table>
        <thead>
            <tr>
                                  
                <g:sortableColumn property="country" title="Country" />
            
                <g:sortableColumn property="state" title="State" />
            
                <g:sortableColumn property="city" title="City" />
            
            </tr>
        </thead>
        <tbody>
        <g:each in="${cities}" status="i" var="city">
            <tr>
                             
                <td>${fieldValue(bean: city.state, field: "country")}</td>
            
                <td>${fieldValue(bean: city, field: "state")}</td>
            
                <td>${fieldValue(bean: city, field: "name")}</td>
            
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
