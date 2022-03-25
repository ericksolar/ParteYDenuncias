import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestigoComponent } from './testigo.component';

describe('TestigoComponent', () => {
  let component: TestigoComponent;
  let fixture: ComponentFixture<TestigoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestigoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestigoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
