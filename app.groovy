@RestController
class ThisWillActuallyRun {
  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }
}