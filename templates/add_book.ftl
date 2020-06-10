<html>
  <#include "/header.ftl">
  <body>
    <div class="pa4 black-80">
      <form class="measure center" action="/v1/add" method="POST">
        <fieldset class="ba b--transparent ph0 mh0">
          <legend class="f4 fw6 ph0 mh0">Add bookmark</legend>
          <div class="mt3">
            <label class="db fw6 lh-copy f6" for="url">URL: </label>
            <input class="pa2 input-reset ba bg-transparent w-100" id="url" name="url" type="text">
          </label>
          <div class="mt3">
            <label class="db fw6 lh-copy f6" for="desc">Description: </label>
            <input class="pa2 input-reset ba bg-transparent w-100" id="desc" name="desc" type="text">
          </div>
          <div class="mt3">
            <label class="db fw6 lh-copy f6" for="tags">Tags(Comma Seperated): </label>
            <input class="pa2 input-reset ba bg-transparent w-100" id="tags" name="tags" type="text">
          </div class="mt3">
        </fieldset>
        <div class="">
          <input class="b ph3 pv2 input-reset ba b--black bg-transparent grow pointer f6 dib" type="submit" value="Submit">
        </div>
      </form>
    </div>
  </body>
</html>